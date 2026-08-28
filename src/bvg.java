import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvg {
   public static bvi<bto> a(ccs<?> $$0, int $$1) {
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$2 -> $$2.group($$2.a(ccs.o), $$2.c(ccs.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
