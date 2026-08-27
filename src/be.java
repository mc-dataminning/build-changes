import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class be {
   private static final Logger a = LogUtils.getLogger();
   private final aer b;
   private final eck c;

   public be(aer $$0, eck $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<efg> a(JsonArray $$0, String $$1, eeq $$2) {
      List<efg> $$3 = ac.a(efi.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      ecq $$4 = new ecq($$2, this.c);

      for (efg $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public aer a() {
      return this.b;
   }
}
