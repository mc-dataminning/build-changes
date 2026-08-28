import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fgb extends fgv {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fgb a(JsonObject $$0) {
      fgb $$1 = new fgb();

      try {
         $$1.a = fir.b("invitationId", $$0, "");
         $$1.b = fir.b("worldName", $$0, "");
         $$1.c = fir.b("worldOwnerName", $$0, "");
         $$1.d = fir.a("worldOwnerUuid", $$0, ae.e);
         $$1.e = fir.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
