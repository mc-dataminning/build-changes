import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fat extends fbp {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fat a(JsonObject $$0) {
      fat $$1 = new fat();

      try {
         $$1.a = fdm.b("invitationId", $$0, "");
         $$1.b = fdm.b("worldName", $$0, "");
         $$1.c = fdm.b("worldOwnerName", $$0, "");
         $$1.d = fdm.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fdm.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
