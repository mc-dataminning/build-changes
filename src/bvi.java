import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvi {
   public static bvk<btq> a(ccu<?> $$0, int $$1) {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$2 -> $$2.group($$2.a(ccu.o), $$2.c(ccu.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
