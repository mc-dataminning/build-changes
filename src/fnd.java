import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fnd extends fnf {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fnd.a c = fnd.a.a;

   public static fnd a(String $$0) {
      fnd $$1 = new fnd();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fpc.a("startDate", $$3, 0L);
         $$1.b = fpc.a("daysLeft", $$3, 0);
         $$1.c = b(fpc.b("subscriptionType", $$3, fnd.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fnd.a b(String $$0) {
      try {
         return fnd.a.valueOf($$0);
      } catch (Exception var2) {
         return fnd.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
