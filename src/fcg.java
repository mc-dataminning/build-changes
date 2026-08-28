import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fcg extends fda {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fcg a(JsonObject $$0) {
      fcg $$1 = new fcg();

      try {
         $$1.a = fex.b("invitationId", $$0, "");
         $$1.b = fex.b("worldName", $$0, "");
         $$1.c = fex.b("worldOwnerName", $$0, "");
         $$1.d = fex.a("worldOwnerUuid", $$0, ad.e);
         $$1.e = fex.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
