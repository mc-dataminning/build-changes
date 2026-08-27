import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class erv extends erx {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public erv.a c = erv.a.a;

   public static erv a(String $$0) {
      erv $$1 = new erv();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = etu.a("startDate", $$3, 0L);
         $$1.b = etu.a("daysLeft", $$3, 0);
         $$1.c = b(etu.b("subscriptionType", $$3, erv.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static erv.a b(String $$0) {
      try {
         return erv.a.valueOf($$0);
      } catch (Exception var2) {
         return erv.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
