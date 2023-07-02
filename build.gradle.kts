val projectGroup: String by project
val projectVersion: String by project

plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = projectGroup
version = projectVersion

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}