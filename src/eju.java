import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.List;
import org.slf4j.Logger;

public class eju extends ekf {
   private static final Logger c = LogUtils.getLogger();
   private static final JsonParser d = new JsonParser();
   public long a;
   public List<String> b;

   public static eju a(JsonObject $$0) {
      eju $$1 = new eju();

      try {
         $$1.a = emb.a("serverId", $$0, -1L);
         String $$2 = emb.a("playerList", $$0, null);
         if ($$2 != null) {
            JsonElement $$3 = d.parse($$2);
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

   private static List<String> a(JsonArray $$0) {
      List<String> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            $$1.add($$2.getAsString());
         } catch (Exception var5) {
         }
      }

      return $$1;
   }
}
