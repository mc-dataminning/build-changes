import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fee extends fey {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fee a(JsonObject $$0) {
      fee $$1 = new fee();

      try {
         $$1.a = fgv.b("invitationId", $$0, "");
         $$1.b = fgv.b("worldName", $$0, "");
         $$1.c = fgv.b("worldOwnerName", $$0, "");
         $$1.d = fgv.a("worldOwnerUuid", $$0, ad.e);
         $$1.e = fgv.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
