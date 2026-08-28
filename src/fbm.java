import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fbm extends fci {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fbm a(JsonObject $$0) {
      fbm $$1 = new fbm();

      try {
         $$1.a = fef.b("invitationId", $$0, "");
         $$1.b = fef.b("worldName", $$0, "");
         $$1.c = fef.b("worldOwnerName", $$0, "");
         $$1.d = fef.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fef.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
