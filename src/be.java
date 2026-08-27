import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class be {
   private static final Logger a = LogUtils.getLogger();
   private final aep b;
   private final eck c;
   private final Gson d = ece.a().create();

   public be(aep $$0, eck $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final efh[] a(JsonArray $$0, String $$1, eer $$2) {
      efh[] $$3 = (efh[])this.d.fromJson($$0, efh[].class);
      ecs $$4 = new ecs($$2, this.c);

      for (efh $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public aep a() {
      return this.b;
   }
}
