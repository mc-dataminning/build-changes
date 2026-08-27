import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class euz extends evv {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static euz a(JsonObject $$0) {
      euz $$1 = new euz();

      try {
         $$1.a = exs.b("invitationId", $$0, "");
         $$1.b = exs.b("worldName", $$0, "");
         $$1.c = exs.b("worldOwnerName", $$0, "");
         $$1.d = exs.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = exs.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
