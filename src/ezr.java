import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ezr extends ezt {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ezr.a c = ezr.a.a;

   public static ezr a(String $$0) {
      ezr $$1 = new ezr();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fbq.a("startDate", $$3, 0L);
         $$1.b = fbq.a("daysLeft", $$3, 0);
         $$1.c = b(fbq.b("subscriptionType", $$3, ezr.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ezr.a b(String $$0) {
      try {
         return ezr.a.valueOf($$0);
      } catch (Exception var2) {
         return ezr.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
