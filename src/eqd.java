import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class eqd extends eqz {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static eqd a(JsonObject $$0) {
      eqd $$1 = new eqd();

      try {
         $$1.a = esw.b("invitationId", $$0, "");
         $$1.b = esw.b("worldName", $$0, "");
         $$1.c = esw.b("worldOwnerName", $$0, "");
         $$1.d = esw.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = esw.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
