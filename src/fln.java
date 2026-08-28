import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fln extends fmi {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fln a(JsonObject $$0) {
      fln $$1 = new fln();

      try {
         $$1.a = foe.b("invitationId", $$0, "");
         $$1.b = foe.b("worldName", $$0, "");
         $$1.c = foe.b("worldOwnerName", $$0, "");
         $$1.d = foe.a("worldOwnerUuid", $$0, ag.e);
         $$1.e = foe.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
