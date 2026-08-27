import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fao extends faq {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fao.a c = fao.a.a;

   public static fao a(String $$0) {
      fao $$1 = new fao();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fcn.a("startDate", $$3, 0L);
         $$1.b = fcn.a("daysLeft", $$3, 0);
         $$1.c = b(fcn.b("subscriptionType", $$3, fao.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fao.a b(String $$0) {
      try {
         return fao.a.valueOf($$0);
      } catch (Exception var2) {
         return fao.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
