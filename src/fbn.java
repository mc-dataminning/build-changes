import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbn extends fbp {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fbn.a c = fbn.a.a;

   public static fbn a(String $$0) {
      fbn $$1 = new fbn();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fdm.a("startDate", $$3, 0L);
         $$1.b = fdm.a("daysLeft", $$3, 0);
         $$1.c = b(fdm.b("subscriptionType", $$3, fbn.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fbn.a b(String $$0) {
      try {
         return fbn.a.valueOf($$0);
      } catch (Exception var2) {
         return fbn.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
