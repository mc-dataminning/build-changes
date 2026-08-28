import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fda extends fdc {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fda.a c = fda.a.a;

   public static fda a(String $$0) {
      fda $$1 = new fda();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fez.a("startDate", $$3, 0L);
         $$1.b = fez.a("daysLeft", $$3, 0);
         $$1.c = b(fez.b("subscriptionType", $$3, fda.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fda.a b(String $$0) {
      try {
         return fda.a.valueOf($$0);
      } catch (Exception var2) {
         return fda.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
