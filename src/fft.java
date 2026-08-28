import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fft extends ffv {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fft.a c = fft.a.a;

   public static fft a(String $$0) {
      fft $$1 = new fft();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fhs.a("startDate", $$3, 0L);
         $$1.b = fhs.a("daysLeft", $$3, 0);
         $$1.c = b(fhs.b("subscriptionType", $$3, fft.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fft.a b(String $$0) {
      try {
         return fft.a.valueOf($$0);
      } catch (Exception var2) {
         return fft.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
