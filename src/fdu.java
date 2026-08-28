import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fdu extends feo {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fdu a(JsonObject $$0) {
      fdu $$1 = new fdu();

      try {
         $$1.a = fgl.b("invitationId", $$0, "");
         $$1.b = fgl.b("worldName", $$0, "");
         $$1.c = fgl.b("worldOwnerName", $$0, "");
         $$1.d = fgl.a("worldOwnerUuid", $$0, ad.e);
         $$1.e = fgl.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
