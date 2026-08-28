import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class faz extends fbv {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static faz a(JsonObject $$0) {
      faz $$1 = new faz();

      try {
         $$1.a = fds.b("invitationId", $$0, "");
         $$1.b = fds.b("worldName", $$0, "");
         $$1.c = fds.b("worldOwnerName", $$0, "");
         $$1.d = fds.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fds.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
