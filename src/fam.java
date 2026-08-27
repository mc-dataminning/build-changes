import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fam extends fao {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fam.a c = fam.a.a;

   public static fam a(String $$0) {
      fam $$1 = new fam();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fcl.a("startDate", $$3, 0L);
         $$1.b = fcl.a("daysLeft", $$3, 0);
         $$1.c = b(fcl.b("subscriptionType", $$3, fam.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fam.a b(String $$0) {
      try {
         return fam.a.valueOf($$0);
      } catch (Exception var2) {
         return fam.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
