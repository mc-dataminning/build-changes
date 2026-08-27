import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class esh extends esg {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static esh a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      esh $$3 = new esh();

      try {
         $$3.a = eud.b("downloadLink", $$2, "");
         $$3.b = eud.b("resourcePackUrl", $$2, "");
         $$3.c = eud.b("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
