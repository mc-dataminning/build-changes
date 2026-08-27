import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fcc extends fcy {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fcc a(JsonObject $$0) {
      fcc $$1 = new fcc();

      try {
         $$1.a = fev.b("invitationId", $$0, "");
         $$1.b = fev.b("worldName", $$0, "");
         $$1.c = fev.b("worldOwnerName", $$0, "");
         $$1.d = fev.a("worldOwnerUuid", $$0, ad.e);
         $$1.e = fev.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
