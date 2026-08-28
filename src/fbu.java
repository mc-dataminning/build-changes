import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbu extends fbw {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fbu.a c = fbu.a.a;

   public static fbu a(String $$0) {
      fbu $$1 = new fbu();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fdt.a("startDate", $$3, 0L);
         $$1.b = fdt.a("daysLeft", $$3, 0);
         $$1.c = b(fdt.b("subscriptionType", $$3, fbu.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fbu.a b(String $$0) {
      try {
         return fbu.a.valueOf($$0);
      } catch (Exception var2) {
         return fbu.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
