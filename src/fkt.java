import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fkt extends flo {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fkt a(JsonObject $$0) {
      fkt $$1 = new fkt();

      try {
         $$1.a = fnk.b("invitationId", $$0, "");
         $$1.b = fnk.b("worldName", $$0, "");
         $$1.c = fnk.b("worldOwnerName", $$0, "");
         $$1.d = fnk.a("worldOwnerUuid", $$0, af.e);
         $$1.e = fnk.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
