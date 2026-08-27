import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class exi extends eye {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static exi a(JsonObject $$0) {
      exi $$1 = new exi();

      try {
         $$1.a = fab.b("invitationId", $$0, "");
         $$1.b = fab.b("worldName", $$0, "");
         $$1.c = fab.b("worldOwnerName", $$0, "");
         $$1.d = fab.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fab.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
