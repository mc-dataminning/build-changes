import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class enm extends enl {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static enm a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      enm $$3 = new enm();

      try {
         $$3.a = epi.a("downloadLink", $$2, "");
         $$3.b = epi.a("resourcePackUrl", $$2, "");
         $$3.c = epi.a("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
