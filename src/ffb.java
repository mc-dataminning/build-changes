import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class ffb extends ffv {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static ffb a(JsonObject $$0) {
      ffb $$1 = new ffb();

      try {
         $$1.a = fhs.b("invitationId", $$0, "");
         $$1.b = fhs.b("worldName", $$0, "");
         $$1.c = fhs.b("worldOwnerName", $$0, "");
         $$1.d = fhs.a("worldOwnerUuid", $$0, ae.e);
         $$1.e = fhs.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
