import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class erb extends erx {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static erb a(JsonObject $$0) {
      erb $$1 = new erb();

      try {
         $$1.a = etu.b("invitationId", $$0, "");
         $$1.b = etu.b("worldName", $$0, "");
         $$1.c = etu.b("worldOwnerName", $$0, "");
         $$1.d = etu.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = etu.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
