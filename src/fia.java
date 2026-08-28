import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fia extends fiv {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fia a(JsonObject $$0) {
      fia $$1 = new fia();

      try {
         $$1.a = fkr.b("invitationId", $$0, "");
         $$1.b = fkr.b("worldName", $$0, "");
         $$1.c = fkr.b("worldOwnerName", $$0, "");
         $$1.d = fkr.a("worldOwnerUuid", $$0, ae.e);
         $$1.e = fkr.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
