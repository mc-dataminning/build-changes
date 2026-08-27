import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class eyx extends ezt {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static eyx a(JsonObject $$0) {
      eyx $$1 = new eyx();

      try {
         $$1.a = fbq.b("invitationId", $$0, "");
         $$1.b = fbq.b("worldName", $$0, "");
         $$1.c = fbq.b("worldOwnerName", $$0, "");
         $$1.d = fbq.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fbq.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
