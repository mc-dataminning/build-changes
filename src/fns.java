import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fns extends fnu {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fns.a c = fns.a.a;

   public static fns a(String $$0) {
      fns $$1 = new fns();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fpr.a("startDate", $$3, 0L);
         $$1.b = fpr.a("daysLeft", $$3, 0);
         $$1.c = b(fpr.b("subscriptionType", $$3, fns.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fns.a b(String $$0) {
      try {
         return fns.a.valueOf($$0);
      } catch (Exception var2) {
         return fns.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
