import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fio extends fiq {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fio.a c = fio.a.a;

   public static fio a(String $$0) {
      fio $$1 = new fio();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fkm.a("startDate", $$3, 0L);
         $$1.b = fkm.a("daysLeft", $$3, 0);
         $$1.c = b(fkm.b("subscriptionType", $$3, fio.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fio.a b(String $$0) {
      try {
         return fio.a.valueOf($$0);
      } catch (Exception var2) {
         return fio.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
