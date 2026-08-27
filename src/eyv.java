import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eyv extends ezj {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static eyv a(String $$0) {
      JsonParser $$1 = new JsonParser();
      eyv $$2 = new eyv();

      try {
         JsonObject $$3 = $$1.parse($$0).getAsJsonObject();
         $$2.a = fbg.b("address", $$3, null);
         $$2.b = fbg.b("resourcePackUrl", $$3, null);
         $$2.c = fbg.b("resourcePackHash", $$3, null);
      } catch (Exception var4) {
         d.error("Could not parse RealmsServerAddress: {}", var4.getMessage());
      }

      return $$2;
   }
}
