import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eub extends eud {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public eub.a c = eub.a.a;

   public static eub a(String $$0) {
      eub $$1 = new eub();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = ewa.a("startDate", $$3, 0L);
         $$1.b = ewa.a("daysLeft", $$3, 0);
         $$1.c = b(ewa.b("subscriptionType", $$3, eub.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static eub.a b(String $$0) {
      try {
         return eub.a.valueOf($$0);
      } catch (Exception var2) {
         return eub.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
