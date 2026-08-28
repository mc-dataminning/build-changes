import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fhv extends fhx {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fhv.a c = fhv.a.a;

   public static fhv a(String $$0) {
      fhv $$1 = new fhv();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fjt.a("startDate", $$3, 0L);
         $$1.b = fjt.a("daysLeft", $$3, 0);
         $$1.c = b(fjt.b("subscriptionType", $$3, fhv.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fhv.a b(String $$0) {
      try {
         return fhv.a.valueOf($$0);
      } catch (Exception var2) {
         return fhv.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
