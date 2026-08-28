import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fhv extends fiq {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fhv a(JsonObject $$0) {
      fhv $$1 = new fhv();

      try {
         $$1.a = fkm.b("invitationId", $$0, "");
         $$1.b = fkm.b("worldName", $$0, "");
         $$1.c = fkm.b("worldOwnerName", $$0, "");
         $$1.d = fkm.a("worldOwnerUuid", $$0, ae.e);
         $$1.e = fkm.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
