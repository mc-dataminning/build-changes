import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fit extends fiv {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fit.a c = fit.a.a;

   public static fit a(String $$0) {
      fit $$1 = new fit();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fkr.a("startDate", $$3, 0L);
         $$1.b = fkr.a("daysLeft", $$3, 0);
         $$1.c = b(fkr.b("subscriptionType", $$3, fit.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fit.a b(String $$0) {
      try {
         return fit.a.valueOf($$0);
      } catch (Exception var2) {
         return fit.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
