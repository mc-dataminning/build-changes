import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fli extends fmd {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fli a(JsonObject $$0) {
      fli $$1 = new fli();

      try {
         $$1.a = fnz.b("invitationId", $$0, "");
         $$1.b = fnz.b("worldName", $$0, "");
         $$1.c = fnz.b("worldOwnerName", $$0, "");
         $$1.d = fnz.a("worldOwnerUuid", $$0, ag.e);
         $$1.e = fnz.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
