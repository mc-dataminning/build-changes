import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffa extends ffc {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ffa.a c = ffa.a.a;

   public static ffa a(String $$0) {
      ffa $$1 = new ffa();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fgz.a("startDate", $$3, 0L);
         $$1.b = fgz.a("daysLeft", $$3, 0);
         $$1.c = b(fgz.b("subscriptionType", $$3, ffa.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ffa.a b(String $$0) {
      try {
         return ffa.a.valueOf($$0);
      } catch (Exception var2) {
         return ffa.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
