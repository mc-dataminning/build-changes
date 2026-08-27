import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class bg {
   private static final Logger a = LogUtils.getLogger();
   private final agm b;
   private final eff c;

   public bg(agm $$0, eff $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<eib> a(JsonArray $$0, String $$1, ehl $$2) {
      List<eib> $$3 = ac.a(eid.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      efl $$4 = new efl($$2, this.c);

      for (eib $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public agm a() {
      return this.b;
   }
}
