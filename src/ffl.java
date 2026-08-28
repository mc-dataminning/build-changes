import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffl extends ffn {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ffl.a c = ffl.a.a;

   public static ffl a(String $$0) {
      ffl $$1 = new ffl();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fhk.a("startDate", $$3, 0L);
         $$1.b = fhk.a("daysLeft", $$3, 0);
         $$1.c = b(fhk.b("subscriptionType", $$3, ffl.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ffl.a b(String $$0) {
      try {
         return ffl.a.valueOf($$0);
      } catch (Exception var2) {
         return ffl.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
