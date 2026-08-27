import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eue extends eud {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static eue a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      eue $$3 = new eue();

      try {
         $$3.a = ewa.b("downloadLink", $$2, "");
         $$3.b = ewa.b("resourcePackUrl", $$2, "");
         $$3.c = ewa.b("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
