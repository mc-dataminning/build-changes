import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fhc extends fhx {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fhc a(JsonObject $$0) {
      fhc $$1 = new fhc();

      try {
         $$1.a = fjt.b("invitationId", $$0, "");
         $$1.b = fjt.b("worldName", $$0, "");
         $$1.c = fjt.b("worldOwnerName", $$0, "");
         $$1.d = fjt.a("worldOwnerUuid", $$0, af.e);
         $$1.e = fjt.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
