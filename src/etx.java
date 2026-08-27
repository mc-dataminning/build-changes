import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class etx extends etw {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static etx a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      etx $$3 = new etx();

      try {
         $$3.a = evt.b("downloadLink", $$2, "");
         $$3.b = evt.b("resourcePackUrl", $$2, "");
         $$3.c = evt.b("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
