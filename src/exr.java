import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class exr extends eyn {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static exr a(JsonObject $$0) {
      exr $$1 = new exr();

      try {
         $$1.a = fak.b("invitationId", $$0, "");
         $$1.b = fak.b("worldName", $$0, "");
         $$1.c = fak.b("worldOwnerName", $$0, "");
         $$1.d = fak.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fak.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
