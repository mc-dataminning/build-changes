import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class evb extends evx {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static evb a(JsonObject $$0) {
      evb $$1 = new evb();

      try {
         $$1.a = exu.b("invitationId", $$0, "");
         $$1.b = exu.b("worldName", $$0, "");
         $$1.c = exu.b("worldOwnerName", $$0, "");
         $$1.d = exu.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = exu.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
