import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fnq extends fns {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fnq.a c = fnq.a.a;

   public static fnq a(String $$0) {
      fnq $$1 = new fnq();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fpp.a("startDate", $$3, 0L);
         $$1.b = fpp.a("daysLeft", $$3, 0);
         $$1.c = b(fpp.b("subscriptionType", $$3, fnq.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fnq.a b(String $$0) {
      try {
         return fnq.a.valueOf($$0);
      } catch (Exception var2) {
         return fnq.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
