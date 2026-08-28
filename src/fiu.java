import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fiu extends fiw {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fiu.a c = fiu.a.a;

   public static fiu a(String $$0) {
      fiu $$1 = new fiu();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fks.a("startDate", $$3, 0L);
         $$1.b = fks.a("daysLeft", $$3, 0);
         $$1.c = b(fks.b("subscriptionType", $$3, fiu.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fiu.a b(String $$0) {
      try {
         return fiu.a.valueOf($$0);
      } catch (Exception var2) {
         return fiu.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
