import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

public class fkv extends flh {
   private static final Logger b = LogUtils.getLogger();
   public List<fkt> a;

   public static fkv a(String $$0) {
      fkv $$1 = new fkv();
      $$1.a = new ArrayList<>();

      try {
         JsonObject $$2 = JsonParser.parseString($$0).getAsJsonObject();
         if ($$2.get("servers").isJsonArray()) {
            for (JsonElement $$4 : $$2.get("servers").getAsJsonArray()) {
               $$1.a.add(fkt.a($$4.getAsJsonObject()));
            }
         }
      } catch (Exception var6) {
         b.error("Could not parse McoServerList: {}", var6.getMessage());
      }

      return $$1;
   }
}
