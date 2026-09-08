package com.mojang.realmsclient.dto;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record InviteCodeRequestDto(
   @SerializedName("linkId") @Nullable String code,
   @SerializedName("realmId") long realmId,
   @SerializedName("enabled") boolean enabled,
   @SerializedName("expirationDate") @Nullable Long expirationDate
) implements ReflectionBasedSerialization {
}
