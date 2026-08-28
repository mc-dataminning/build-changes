import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fgm extends fgo {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fgm.a c = fgm.a.a;

   public static fgm a(String $$0) {
      fgm $$1 = new fgm();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fik.a("startDate", $$3, 0L);
         $$1.b = fik.a("daysLeft", $$3, 0);
         $$1.c = b(fik.b("subscriptionType", $$3, fgm.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fgm.a b(String $$0) {
      try {
         return fgm.a.valueOf($$0);
      } catch (Exception var2) {
         return fgm.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
