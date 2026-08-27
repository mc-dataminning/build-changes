import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ene extends end {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static ene a(String $$0) {
      JsonParser $$1 = new JsonParser();
      JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
      ene $$3 = new ene();

      try {
         $$3.a = epa.a("downloadLink", $$2, "");
         $$3.b = epa.a("resourcePackUrl", $$2, "");
         $$3.c = epa.a("resourcePackHash", $$2, "");
      } catch (Exception var5) {
         d.error("Could not parse WorldDownload: {}", var5.getMessage());
      }

      return $$3;
   }
}
