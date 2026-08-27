import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class bg {
   private static final Logger a = LogUtils.getLogger();
   private final aeu b;
   private final eco c;

   public bg(aeu $$0, eco $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<efk> a(JsonArray $$0, String $$1, eeu $$2) {
      List<efk> $$3 = ac.a(efm.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      ecu $$4 = new ecu($$2, this.c);

      for (efk $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public aeu a() {
      return this.b;
   }
}
