import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ese extends esg {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ese.a c = ese.a.a;

   public static ese a(String $$0) {
      ese $$1 = new ese();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = eud.a("startDate", $$3, 0L);
         $$1.b = eud.a("daysLeft", $$3, 0);
         $$1.c = b(eud.b("subscriptionType", $$3, ese.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ese.a b(String $$0) {
      try {
         return ese.a.valueOf($$0);
      } catch (Exception var2) {
         return ese.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
