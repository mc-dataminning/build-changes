import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fhe extends fhz {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fhe a(JsonObject $$0) {
      fhe $$1 = new fhe();

      try {
         $$1.a = fjv.b("invitationId", $$0, "");
         $$1.b = fjv.b("worldName", $$0, "");
         $$1.c = fjv.b("worldOwnerName", $$0, "");
         $$1.d = fjv.a("worldOwnerUuid", $$0, af.e);
         $$1.e = fjv.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
