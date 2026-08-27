import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epy extends epx {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static epy a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      epy $$3 = new epy();

      try {
         $$3.a = eru.b("downloadLink", $$2, "");
         $$3.b = eru.b("resourcePackUrl", $$2, "");
         $$3.c = eru.b("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
