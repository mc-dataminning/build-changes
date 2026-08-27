import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boe {
   public static bog<bmo> a(bvq<?> $$0, int $$1) {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$2 -> $$2.group($$2.a(bvq.o), $$2.c(bvq.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
