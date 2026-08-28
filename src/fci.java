import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fci extends fck {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fci.a c = fci.a.a;

   public static fci a(String $$0) {
      fci $$1 = new fci();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = feh.a("startDate", $$3, 0L);
         $$1.b = feh.a("daysLeft", $$3, 0);
         $$1.c = b(feh.b("subscriptionType", $$3, fci.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fci.a b(String $$0) {
      try {
         return fci.a.valueOf($$0);
      } catch (Exception var2) {
         return fci.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
