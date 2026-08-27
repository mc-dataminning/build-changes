import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eqx extends eqz {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public eqx.a c = eqx.a.a;

   public static eqx a(String $$0) {
      eqx $$1 = new eqx();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = esw.a("startDate", $$3, 0L);
         $$1.b = esw.a("daysLeft", $$3, 0);
         $$1.c = b(esw.b("subscriptionType", $$3, eqx.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static eqx.a b(String $$0) {
      try {
         return eqx.a.valueOf($$0);
      } catch (Exception var2) {
         return eqx.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
