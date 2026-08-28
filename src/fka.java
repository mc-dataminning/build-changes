import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fka extends fkv {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fka a(JsonObject $$0) {
      fka $$1 = new fka();

      try {
         $$1.a = fmr.b("invitationId", $$0, "");
         $$1.b = fmr.b("worldName", $$0, "");
         $$1.c = fmr.b("worldOwnerName", $$0, "");
         $$1.d = fmr.a("worldOwnerUuid", $$0, af.e);
         $$1.e = fmr.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
