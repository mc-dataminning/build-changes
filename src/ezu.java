import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ezu extends ezt {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static ezu a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      ezu $$3 = new ezu();

      try {
         $$3.a = fbq.b("downloadLink", $$2, "");
         $$3.b = fbq.b("resourcePackUrl", $$2, "");
         $$3.c = fbq.b("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
