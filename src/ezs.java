import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class ezs extends fao {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static ezs a(JsonObject $$0) {
      ezs $$1 = new ezs();

      try {
         $$1.a = fcl.b("invitationId", $$0, "");
         $$1.b = fcl.b("worldName", $$0, "");
         $$1.c = fcl.b("worldOwnerName", $$0, "");
         $$1.d = fcl.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fcl.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
