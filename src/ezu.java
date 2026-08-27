import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class ezu extends faq {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static ezu a(JsonObject $$0) {
      ezu $$1 = new ezu();

      try {
         $$1.a = fcn.b("invitationId", $$0, "");
         $$1.b = fcn.b("worldName", $$0, "");
         $$1.c = fcn.b("worldOwnerName", $$0, "");
         $$1.d = fcn.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fcn.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
