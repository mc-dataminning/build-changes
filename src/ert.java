import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ert extends erv {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ert.a c = ert.a.a;

   public static ert a(String $$0) {
      ert $$1 = new ert();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = ets.a("startDate", $$3, 0L);
         $$1.b = ets.a("daysLeft", $$3, 0);
         $$1.c = b(ets.b("subscriptionType", $$3, ert.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ert.a b(String $$0) {
      try {
         return ert.a.valueOf($$0);
      } catch (Exception var2) {
         return ert.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
