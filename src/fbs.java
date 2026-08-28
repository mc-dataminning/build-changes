import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbs extends fbu {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fbs.a c = fbs.a.a;

   public static fbs a(String $$0) {
      fbs $$1 = new fbs();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fdr.a("startDate", $$3, 0L);
         $$1.b = fdr.a("daysLeft", $$3, 0);
         $$1.c = b(fdr.b("subscriptionType", $$3, fbs.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fbs.a b(String $$0) {
      try {
         return fbs.a.valueOf($$0);
      } catch (Exception var2) {
         return fbs.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
