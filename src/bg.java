import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class bg {
   private static final Logger a = LogUtils.getLogger();
   private final agi b;
   private final efa c;

   public bg(agi $$0, efa $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<ehw> a(JsonArray $$0, String $$1, ehg $$2) {
      List<ehw> $$3 = ac.a(ehy.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      efg $$4 = new efg($$2, this.c);

      for (ehw $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public agi a() {
      return this.b;
   }
}
