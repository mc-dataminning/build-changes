import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

public class fhn extends fhz {
   private static final Logger b = LogUtils.getLogger();
   public List<fhl> a;

   public static fhn a(String $$0) {
      fhn $$1 = new fhn();
      $$1.a = new ArrayList<>();

      try {
         JsonObject $$2 = JsonParser.parseString($$0).getAsJsonObject();
         if ($$2.get("servers").isJsonArray()) {
            for (JsonElement $$4 : $$2.get("servers").getAsJsonArray()) {
               $$1.a.add(fhl.a($$4.getAsJsonObject()));
            }
         }
      } catch (Exception var6) {
         b.error("Could not parse McoServerList: {}", var6.getMessage());
      }

      return $$1;
   }
}
