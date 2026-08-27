import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class ems extends end {
   private static final Logger c = LogUtils.getLogger();
   public long a;
   public List<UUID> b;

   public static ems a(JsonObject $$0) {
      ems $$1 = new ems();

      try {
         $$1.a = epa.a("serverId", $$0, -1L);
         String $$2 = epa.a("playerList", $$0, null);
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
      List<UUID> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            $$1.add(UndashedUuid.fromStringLenient($$2.getAsString()));
         } catch (Exception var5) {
         }
      }

      return $$1;
   }
}
