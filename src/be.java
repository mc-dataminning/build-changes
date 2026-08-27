import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class be {
   private static final Logger a = LogUtils.getLogger();
   private final acq b;
   private final dzn c;
   private final Gson d = dzh.a().create();

   public be(acq $$0, dzn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final eck[] a(JsonArray $$0, String $$1, ebu $$2) {
      eck[] $$3 = (eck[])this.d.fromJson($$0, eck[].class);
      dzv $$4 = new dzv($$2, this.c);

      for (eck $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public acq a() {
      return this.b;
   }
}
