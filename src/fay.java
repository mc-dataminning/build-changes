import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fay extends fbu {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fay a(JsonObject $$0) {
      fay $$1 = new fay();

      try {
         $$1.a = fdr.b("invitationId", $$0, "");
         $$1.b = fdr.b("worldName", $$0, "");
         $$1.c = fdr.b("worldOwnerName", $$0, "");
         $$1.d = fdr.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fdr.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
