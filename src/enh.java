import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class enh extends eng {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static enh a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      enh $$3 = new enh();

      try {
         $$3.a = epd.a("downloadLink", $$2, "");
         $$3.b = epd.a("resourcePackUrl", $$2, "");
         $$3.c = epd.a("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
