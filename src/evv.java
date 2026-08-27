import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class evv extends evx {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public evv.a c = evv.a.a;

   public static evv a(String $$0) {
      evv $$1 = new evv();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = exu.a("startDate", $$3, 0L);
         $$1.b = exu.a("daysLeft", $$3, 0);
         $$1.c = b(exu.b("subscriptionType", $$3, evv.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static evv.a b(String $$0) {
      try {
         return evv.a.valueOf($$0);
      } catch (Exception var2) {
         return evv.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
