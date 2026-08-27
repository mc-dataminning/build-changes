import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class eta extends etw {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static eta a(JsonObject $$0) {
      eta $$1 = new eta();

      try {
         $$1.a = evt.b("invitationId", $$0, "");
         $$1.b = evt.b("worldName", $$0, "");
         $$1.c = evt.b("worldOwnerName", $$0, "");
         $$1.d = evt.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = evt.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
