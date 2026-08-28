import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fmz extends fnu {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fmz a(JsonObject $$0) {
      fmz $$1 = new fmz();

      try {
         $$1.a = fpr.b("invitationId", $$0, "");
         $$1.b = fpr.b("worldName", $$0, "");
         $$1.c = fpr.b("worldOwnerName", $$0, "");
         $$1.d = fpr.a("worldOwnerUuid", $$0, ag.e);
         $$1.e = fpr.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
