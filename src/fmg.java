import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fmg extends fmi {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fmg.a c = fmg.a.a;

   public static fmg a(String $$0) {
      fmg $$1 = new fmg();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = foe.a("startDate", $$3, 0L);
         $$1.b = foe.a("daysLeft", $$3, 0);
         $$1.c = b(foe.b("subscriptionType", $$3, fmg.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fmg.a b(String $$0) {
      try {
         return fmg.a.valueOf($$0);
      } catch (Exception var2) {
         return fmg.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
