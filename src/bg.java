import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class bg {
   private static final Logger a = LogUtils.getLogger();
   private final aex b;
   private final ect c;

   public bg(aex $$0, ect $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<efp> a(JsonArray $$0, String $$1, eez $$2) {
      List<efp> $$3 = ac.a(efr.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      ecz $$4 = new ecz($$2, this.c);

      for (efp $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public aex a() {
      return this.b;
   }
}
