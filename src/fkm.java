import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fkm extends flh {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fkm a(JsonObject $$0) {
      fkm $$1 = new fkm();

      try {
         $$1.a = fnd.b("invitationId", $$0, "");
         $$1.b = fnd.b("worldName", $$0, "");
         $$1.c = fnd.b("worldOwnerName", $$0, "");
         $$1.d = fnd.a("worldOwnerUuid", $$0, af.e);
         $$1.e = fnd.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
