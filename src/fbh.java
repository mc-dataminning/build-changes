import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public class fbh extends fbu {
   private static final Logger b = LogUtils.getLogger();
   public List<fbf> a;

   public static fbh a(String $$0) {
      fbh $$1 = new fbh();
      $$1.a = Lists.newArrayList();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         if ($$3.get("servers").isJsonArray()) {
            JsonArray $$4 = $$3.get("servers").getAsJsonArray();
            Iterator<JsonElement> $$5 = $$4.iterator();

            while ($$5.hasNext()) {
               $$1.a.add(fbf.a($$5.next().getAsJsonObject()));
            }
         }
      } catch (Exception var6) {
         b.error("Could not parse McoServerList: {}", var6.getMessage());
      }

      return $$1;
   }
}
