import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ern extends erp {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ern.a c = ern.a.a;

   public static ern a(String $$0) {
      ern $$1 = new ern();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = etm.a("startDate", $$3, 0L);
         $$1.b = etm.a("daysLeft", $$3, 0);
         $$1.c = b(etm.b("subscriptionType", $$3, ern.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ern.a b(String $$0) {
      try {
         return ern.a.valueOf($$0);
      } catch (Exception var2) {
         return ern.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
