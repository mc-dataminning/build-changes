import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class bg {
   private static final Logger a = LogUtils.getLogger();
   private final agg b;
   private final eeo c;

   public bg(agg $$0, eeo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<ehk> a(JsonArray $$0, String $$1, egu $$2) {
      List<ehk> $$3 = ac.a(ehm.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      eeu $$4 = new eeu($$2, this.c);

      for (ehk $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public agg a() {
      return this.b;
   }
}
