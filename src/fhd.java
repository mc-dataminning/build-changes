import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fhd extends fhy {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fhd a(JsonObject $$0) {
      fhd $$1 = new fhd();

      try {
         $$1.a = fju.b("invitationId", $$0, "");
         $$1.b = fju.b("worldName", $$0, "");
         $$1.c = fju.b("worldOwnerName", $$0, "");
         $$1.d = fju.a("worldOwnerUuid", $$0, af.e);
         $$1.e = fju.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
