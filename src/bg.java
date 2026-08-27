import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class bg {
   private static final Logger a = LogUtils.getLogger();
   private final afw b;
   private final edl c;

   public bg(afw $$0, edl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<egh> a(JsonArray $$0, String $$1, efr $$2) {
      List<egh> $$3 = ac.a(egj.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      edr $$4 = new edr($$2, this.c);

      for (egh $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public afw a() {
      return this.b;
   }
}
