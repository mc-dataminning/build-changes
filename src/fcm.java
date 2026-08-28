import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;

public class fcm extends fcw {
   private static final Logger b = LogUtils.getLogger();
   public Map<Long, List<ProfileResult>> a;

   public static fcm a(String $$0) {
      fcm $$1 = new fcm();
      Builder<Long, List<ProfileResult>> $$2 = ImmutableMap.builder();

      try {
         JsonObject $$3 = ayd.a($$0);
         if (ayd.d($$3, "lists")) {
            for (JsonElement $$5 : $$3.getAsJsonArray("lists")) {
               JsonObject $$6 = $$5.getAsJsonObject();
               String $$7 = fet.b("playerList", $$6, null);
               List<ProfileResult> $$9;
               if ($$7 != null) {
                  JsonElement $$8 = JsonParser.parseString($$7);
                  if ($$8.isJsonArray()) {
                     $$9 = a($$8.getAsJsonArray());
                  } else {
                     $$9 = Lists.newArrayList();
                  }
               } else {
                  $$9 = Lists.newArrayList();
               }

               $$2.put(fet.a("serverId", $$6, -1L), $$9);
            }
         }
      } catch (Exception var11) {
         b.error("Could not parse RealmsServerPlayerLists: {}", var11.getMessage());
      }

      $$1.a = $$2.build();
      return $$1;
   }

   private static List<ProfileResult> a(JsonArray $$0) {
      List<ProfileResult> $$1 = new ArrayList<>($$0.size());
      MinecraftSessionService $$2 = fgi.Q().al();

      for (JsonElement $$3 : $$0) {
         if ($$3.isJsonObject()) {
            UUID $$4 = fet.a("playerId", $$3.getAsJsonObject(), null);
            if ($$4 != null && !fgi.Q().b($$4)) {
               try {
                  ProfileResult $$5 = $$2.fetchProfile($$4, false);
                  if ($$5 != null) {
                     $$1.add($$5);
                  }
               } catch (Exception var7) {
                  b.error("Could not get name for {}", $$4, var7);
               }
            }
         }
      }

      return $$1;
   }

   public List<ProfileResult> a(long $$0) {
      List<ProfileResult> $$1 = this.a.get($$0);
      return $$1 != null ? $$1 : List.of();
   }
}
