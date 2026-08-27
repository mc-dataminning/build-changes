import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eyl extends eyn {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public eyl.a c = eyl.a.a;

   public static eyl a(String $$0) {
      eyl $$1 = new eyl();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fak.a("startDate", $$3, 0L);
         $$1.b = fak.a("daysLeft", $$3, 0);
         $$1.c = b(fak.b("subscriptionType", $$3, eyl.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static eyl.a b(String $$0) {
      try {
         return eyl.a.valueOf($$0);
      } catch (Exception var2) {
         return eyl.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
