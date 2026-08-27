import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class erl extends erw {
   private static final Logger c = LogUtils.getLogger();
   public long a;
   public List<UUID> b;

   public static erl a(JsonObject $$0) {
      erl $$1 = new erl();

      try {
         $$1.a = ett.a("serverId", $$0, -1L);
         String $$2 = ett.b("playerList", $$0, null);
         if ($$2 != null) {
            JsonElement $$3 = JsonParser.parseString($$2);
            if ($$3.isJsonArray()) {
               $$1.b = a($$3.getAsJsonArray());
            } else {
               $$1.b = Lists.newArrayList();
            }
         } else {
            $$1.b = Lists.newArrayList();
         }
      } catch (Exception var4) {
         c.error("Could not parse RealmsServerPlayerList: {}", var4.getMessage());
      }

      return $$1;
   }

   private static List<UUID> a(JsonArray $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (JsonElement $$2 : $$0) {
         if ($$2.isJsonObject()) {
            UUID $$3 = ett.a("playerId", $$2.getAsJsonObject(), null);
            if ($$3 != null) {
               $$1.add($$3);
            }
         }
      }

      return $$1;
   }
}
