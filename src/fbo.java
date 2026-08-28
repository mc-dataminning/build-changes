import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fbo extends fck {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fbo a(JsonObject $$0) {
      fbo $$1 = new fbo();

      try {
         $$1.a = feh.b("invitationId", $$0, "");
         $$1.b = feh.b("worldName", $$0, "");
         $$1.c = feh.b("worldOwnerName", $$0, "");
         $$1.d = feh.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = feh.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
