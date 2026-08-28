import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flv extends fmi {
   private static final Logger d = LogUtils.getLogger();
   @Nullable
   public String a;
   @Nullable
   public String b;
   @Nullable
   public String c;

   public static flv a(String $$0) {
      flv $$1 = new flv();

      try {
         JsonObject $$2 = JsonParser.parseString($$0).getAsJsonObject();
         $$1.a = foe.b("address", $$2, null);
         $$1.b = foe.b("resourcePackUrl", $$2, null);
         $$1.c = foe.b("resourcePackHash", $$2, null);
      } catch (Exception var3) {
         d.error("Could not parse RealmsServerAddress: {}", var3.getMessage());
      }

      return $$1;
   }
}
