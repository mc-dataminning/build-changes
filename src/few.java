import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class few extends fey {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public few.a c = few.a.a;

   public static few a(String $$0) {
      few $$1 = new few();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fgv.a("startDate", $$3, 0L);
         $$1.b = fgv.a("daysLeft", $$3, 0);
         $$1.c = b(fgv.b("subscriptionType", $$3, few.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static few.a b(String $$0) {
      try {
         return few.a.valueOf($$0);
      } catch (Exception var2) {
         return few.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
