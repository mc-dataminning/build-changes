import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnf extends fns {
   private static final Logger d = LogUtils.getLogger();
   @Nullable
   public String a;
   @Nullable
   public String b;
   @Nullable
   public String c;

   public static fnf a(String $$0) {
      fnf $$1 = new fnf();

      try {
         JsonObject $$2 = JsonParser.parseString($$0).getAsJsonObject();
         $$1.a = fpp.b("address", $$2, null);
         $$1.b = fpp.b("resourcePackUrl", $$2, null);
         $$1.c = fpp.b("resourcePackHash", $$2, null);
      } catch (Exception var3) {
         d.error("Could not parse RealmsServerAddress: {}", var3.getMessage());
      }

      return $$1;
   }
}
