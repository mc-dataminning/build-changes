import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fcu extends fcw {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fcu.a c = fcu.a.a;

   public static fcu a(String $$0) {
      fcu $$1 = new fcu();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fet.a("startDate", $$3, 0L);
         $$1.b = fet.a("daysLeft", $$3, 0);
         $$1.c = b(fet.b("subscriptionType", $$3, fcu.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fcu.a b(String $$0) {
      try {
         return fcu.a.valueOf($$0);
      } catch (Exception var2) {
         return fcu.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
