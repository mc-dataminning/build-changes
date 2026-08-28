import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fei extends ffc {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fei a(JsonObject $$0) {
      fei $$1 = new fei();

      try {
         $$1.a = fgz.b("invitationId", $$0, "");
         $$1.b = fgz.b("worldName", $$0, "");
         $$1.c = fgz.b("worldOwnerName", $$0, "");
         $$1.d = fgz.a("worldOwnerUuid", $$0, ad.e);
         $$1.e = fgz.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
