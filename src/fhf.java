import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fhf extends fia {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fhf a(JsonObject $$0) {
      fhf $$1 = new fhf();

      try {
         $$1.a = fjw.b("invitationId", $$0, "");
         $$1.b = fjw.b("worldName", $$0, "");
         $$1.c = fjw.b("worldOwnerName", $$0, "");
         $$1.d = fjw.a("worldOwnerUuid", $$0, af.e);
         $$1.e = fjw.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
