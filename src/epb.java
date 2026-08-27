import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class epb extends epx {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static epb a(JsonObject $$0) {
      epb $$1 = new epb();

      try {
         $$1.a = eru.b("invitationId", $$0, "");
         $$1.b = eru.b("worldName", $$0, "");
         $$1.c = eru.b("worldOwnerName", $$0, "");
         $$1.d = eru.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = eru.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
