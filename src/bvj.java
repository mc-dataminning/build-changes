import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvj {
   public static bvl<btr> a(ccv<?> $$0, int $$1) {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$2 -> $$2.group($$2.a(ccv.o), $$2.c(ccv.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
