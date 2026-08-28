import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fhy extends fia {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fhy.a c = fhy.a.a;

   public static fhy a(String $$0) {
      fhy $$1 = new fhy();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fjw.a("startDate", $$3, 0L);
         $$1.b = fjw.a("daysLeft", $$3, 0);
         $$1.c = b(fjw.b("subscriptionType", $$3, fhy.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fhy.a b(String $$0) {
      try {
         return fhy.a.valueOf($$0);
      } catch (Exception var2) {
         return fhy.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
