import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class erq extends erp {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static erq a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      erq $$3 = new erq();

      try {
         $$3.a = etm.b("downloadLink", $$2, "");
         $$3.b = etm.b("resourcePackUrl", $$2, "");
         $$3.c = etm.b("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
