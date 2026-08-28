import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbt extends fbv {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fbt.a c = fbt.a.a;

   public static fbt a(String $$0) {
      fbt $$1 = new fbt();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fds.a("startDate", $$3, 0L);
         $$1.b = fds.a("daysLeft", $$3, 0);
         $$1.c = b(fds.b("subscriptionType", $$3, fbt.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fbt.a b(String $$0) {
      try {
         return fbt.a.valueOf($$0);
      } catch (Exception var2) {
         return fbt.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
