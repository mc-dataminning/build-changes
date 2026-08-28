import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class faw extends fbs {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static faw a(JsonObject $$0) {
      faw $$1 = new faw();

      try {
         $$1.a = fdp.b("invitationId", $$0, "");
         $$1.b = fdp.b("worldName", $$0, "");
         $$1.c = fdp.b("worldOwnerName", $$0, "");
         $$1.d = fdp.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fdp.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
