package com.mojang.realmsclient.dto;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record RealmTierConfigurationDto(
   @SerializedName("renderDistance") RealmTierConfigurationDto.RealmTierRangeDto renderDistance,
   @SerializedName("simDistance") RealmTierConfigurationDto.RealmTierRangeDto simDistance
) implements ReflectionBasedSerialization {
   public static record RealmTierRangeDto(
      @SerializedName("min") int min,
      @SerializedName("max") int max,
      @SerializedName("defaultValue") int defaultValue,
      @Nullable @SerializedName("current") Integer current
   ) implements ReflectionBasedSerialization {
   }
}
