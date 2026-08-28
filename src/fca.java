import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fca extends fcc {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fca.a c = fca.a.a;

   public static fca a(String $$0) {
      fca $$1 = new fca();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fdz.a("startDate", $$3, 0L);
         $$1.b = fdz.a("daysLeft", $$3, 0);
         $$1.c = b(fdz.b("subscriptionType", $$3, fca.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fca.a b(String $$0) {
      try {
         return fca.a.valueOf($$0);
      } catch (Exception var2) {
         return fca.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
