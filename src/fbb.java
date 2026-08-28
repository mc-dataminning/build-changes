import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbb extends fbp {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static fbb a(String $$0) {
      JsonParser $$1 = new JsonParser();
      fbb $$2 = new fbb();

      try {
         JsonObject $$3 = $$1.parse($$0).getAsJsonObject();
         $$2.a = fdm.b("address", $$3, null);
         $$2.b = fdm.b("resourcePackUrl", $$3, null);
         $$2.c = fdm.b("resourcePackHash", $$3, null);
      } catch (Exception var4) {
         d.error("Could not parse RealmsServerAddress: {}", var4.getMessage());
      }

      return $$2;
   }
}
