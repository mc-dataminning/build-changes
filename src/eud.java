import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class eud extends euz {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static eud a(JsonObject $$0) {
      eud $$1 = new eud();

      try {
         $$1.a = eww.b("invitationId", $$0, "");
         $$1.b = eww.b("worldName", $$0, "");
         $$1.c = eww.b("worldOwnerName", $$0, "");
         $$1.d = eww.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = eww.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
