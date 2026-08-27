import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class be {
   private static final Logger a = LogUtils.getLogger();
   private final aer b;
   private final ecj c;

   public be(aer $$0, ecj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<eff> a(JsonArray $$0, String $$1, eep $$2) {
      List<eff> $$3 = ac.a(efh.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      ecp $$4 = new ecp($$2, this.c);

      for (eff $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public aer a() {
      return this.b;
   }
}
