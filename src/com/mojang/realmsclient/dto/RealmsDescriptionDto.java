package com.mojang.realmsclient.dto;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record RealmsDescriptionDto(@Nullable @SerializedName("name") String name, @SerializedName("description") String description)
   implements ReflectionBasedSerialization {
}
