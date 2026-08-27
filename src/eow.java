import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class eow extends eps {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static eow a(JsonObject $$0) {
      eow $$1 = new eow();

      try {
         $$1.a = erp.b("invitationId", $$0, "");
         $$1.b = erp.b("worldName", $$0, "");
         $$1.c = erp.b("worldOwnerName", $$0, "");
         $$1.d = erp.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = erp.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
