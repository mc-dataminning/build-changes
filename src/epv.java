import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epv extends epx {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public epv.a c = epv.a.a;

   public static epv a(String $$0) {
      epv $$1 = new epv();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = eru.a("startDate", $$3, 0L);
         $$1.b = eru.a("daysLeft", $$3, 0);
         $$1.c = b(eru.b("subscriptionType", $$3, epv.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static epv.a b(String $$0) {
      try {
         return epv.a.valueOf($$0);
      } catch (Exception var2) {
         return epv.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
