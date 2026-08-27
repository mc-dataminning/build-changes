import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class era extends erw {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static era a(JsonObject $$0) {
      era $$1 = new era();

      try {
         $$1.a = ett.b("invitationId", $$0, "");
         $$1.b = ett.b("worldName", $$0, "");
         $$1.c = ett.b("worldOwnerName", $$0, "");
         $$1.d = ett.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = ett.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
