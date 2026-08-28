import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fcy extends fda {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fcy.a c = fcy.a.a;

   public static fcy a(String $$0) {
      fcy $$1 = new fcy();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fex.a("startDate", $$3, 0L);
         $$1.b = fex.a("daysLeft", $$3, 0);
         $$1.c = b(fex.b("subscriptionType", $$3, fcy.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fcy.a b(String $$0) {
      try {
         return fcy.a.valueOf($$0);
      } catch (Exception var2) {
         return fcy.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
