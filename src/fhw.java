import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fhw extends fhy {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fhw.a c = fhw.a.a;

   public static fhw a(String $$0) {
      fhw $$1 = new fhw();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fju.a("startDate", $$3, 0L);
         $$1.b = fju.a("daysLeft", $$3, 0);
         $$1.c = b(fju.b("subscriptionType", $$3, fhw.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fhw.a b(String $$0) {
      try {
         return fhw.a.valueOf($$0);
      } catch (Exception var2) {
         return fhw.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
