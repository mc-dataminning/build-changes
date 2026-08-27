import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.List;
import org.slf4j.Logger;

public class bg {
   private static final Logger a = LogUtils.getLogger();
   private final aez b;
   private final ecn c;

   public bg(aez $$0, ecn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final List<efj> a(JsonArray $$0, String $$1, eet $$2) {
      List<efj> $$3 = ac.a(efl.a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      ect $$4 = new ect($$2, this.c);

      for (efj $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public aez a() {
      return this.b;
   }
}
