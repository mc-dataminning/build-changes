import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fet extends ffn {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fet a(JsonObject $$0) {
      fet $$1 = new fet();

      try {
         $$1.a = fhk.b("invitationId", $$0, "");
         $$1.b = fhk.b("worldName", $$0, "");
         $$1.c = fhk.b("worldOwnerName", $$0, "");
         $$1.d = fhk.a("worldOwnerUuid", $$0, ad.e);
         $$1.e = fhk.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
