import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmp extends fnf {
   private static final Logger b = LogUtils.getLogger();
   @Nullable
   public String a;

   public static fmp a(String $$0) {
      fmp $$1 = new fmp();

      try {
         JsonObject $$2 = JsonParser.parseString($$0).getAsJsonObject();
         $$1.a = fpc.b("newsLink", $$2, null);
      } catch (Exception var3) {
         b.error("Could not parse RealmsNews: {}", var3.getMessage());
      }

      return $$1;
   }
}
