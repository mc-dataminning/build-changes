import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class eok extends epg {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static eok a(JsonObject $$0) {
      eok $$1 = new eok();

      try {
         $$1.a = erd.b("invitationId", $$0, "");
         $$1.b = erd.b("worldName", $$0, "");
         $$1.c = erd.b("worldOwnerName", $$0, "");
         $$1.d = erd.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = erd.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
