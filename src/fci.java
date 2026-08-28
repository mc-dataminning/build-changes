import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fci extends fdc {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fci a(JsonObject $$0) {
      fci $$1 = new fci();

      try {
         $$1.a = fez.b("invitationId", $$0, "");
         $$1.b = fez.b("worldName", $$0, "");
         $$1.c = fez.b("worldOwnerName", $$0, "");
         $$1.d = fez.a("worldOwnerUuid", $$0, ad.e);
         $$1.e = fez.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
