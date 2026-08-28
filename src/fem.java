import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fem extends feo {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fem.a c = fem.a.a;

   public static fem a(String $$0) {
      fem $$1 = new fem();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fgl.a("startDate", $$3, 0L);
         $$1.b = fgl.a("daysLeft", $$3, 0);
         $$1.c = b(fgl.b("subscriptionType", $$3, fem.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fem.a b(String $$0) {
      try {
         return fem.a.valueOf($$0);
      } catch (Exception var2) {
         return fem.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
