import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fmx extends fns {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fmx a(JsonObject $$0) {
      fmx $$1 = new fmx();

      try {
         $$1.a = fpp.b("invitationId", $$0, "");
         $$1.b = fpp.b("worldName", $$0, "");
         $$1.c = fpp.b("worldOwnerName", $$0, "");
         $$1.d = fpp.a("worldOwnerUuid", $$0, ag.e);
         $$1.e = fpp.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
