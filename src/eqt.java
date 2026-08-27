import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class eqt extends erp {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static eqt a(JsonObject $$0) {
      eqt $$1 = new eqt();

      try {
         $$1.a = etm.b("invitationId", $$0, "");
         $$1.b = etm.b("worldName", $$0, "");
         $$1.c = etm.b("worldOwnerName", $$0, "");
         $$1.d = etm.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = etm.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
