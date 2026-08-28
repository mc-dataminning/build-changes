import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhi extends fhy {
   private static final Logger b = LogUtils.getLogger();
   @Nullable
   public String a;

   public static fhi a(String $$0) {
      fhi $$1 = new fhi();

      try {
         JsonObject $$2 = JsonParser.parseString($$0).getAsJsonObject();
         $$1.a = fju.b("newsLink", $$2, null);
      } catch (Exception var3) {
         b.error("Could not parse RealmsNews: {}", var3.getMessage());
      }

      return $$1;
   }
}
