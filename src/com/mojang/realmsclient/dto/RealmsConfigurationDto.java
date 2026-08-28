package com.mojang.realmsclient.dto;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record RealmsConfigurationDto(
   @SerializedName("options") RealmsSlotUpdateDto options,
   @SerializedName("settings") List<RealmsSetting> settings,
   @Nullable @SerializedName("regionSelectionPreference") RegionSelectionPreferenceDto regionSelectionPreference,
   @Nullable @SerializedName("description") RealmsDescriptionDto description
) implements ReflectionBasedSerialization {
}
