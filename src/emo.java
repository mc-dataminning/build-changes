import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emo extends enc {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static emo a(String $$0) {
      JsonParser $$1 = new JsonParser();
      emo $$2 = new emo();

      try {
         JsonObject $$3 = $$1.parse($$0).getAsJsonObject();
         $$2.a = eoz.a("address", $$3, null);
         $$2.b = eoz.a("resourcePackUrl", $$3, null);
         $$2.c = eoz.a("resourcePackHash", $$3, null);
      } catch (Exception var4) {
         d.error("Could not parse RealmsServerAddress: {}", var4.getMessage());
      }

      return $$2;
   }
}
