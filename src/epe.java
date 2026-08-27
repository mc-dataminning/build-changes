import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epe extends epg {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public epe.a c = epe.a.a;

   public static epe a(String $$0) {
      epe $$1 = new epe();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = erd.a("startDate", $$3, 0L);
         $$1.b = erd.a("daysLeft", $$3, 0);
         $$1.c = b(erd.b("subscriptionType", $$3, epe.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static epe.a b(String $$0) {
      try {
         return epe.a.valueOf($$0);
      } catch (Exception var2) {
         return epe.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
