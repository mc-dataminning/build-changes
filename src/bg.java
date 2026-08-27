import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class bg {
   private static final Logger a = LogUtils.getLogger();
   private final aey b;
   private final ecv c;

   public bg(aey $$0, ecv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<efr> a(JsonArray $$0, String $$1, efb $$2) {
      List<efr> $$3 = ac.a(eft.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      edb $$4 = new edb($$2, this.c);

      for (efr $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public aey a() {
      return this.b;
   }
}
