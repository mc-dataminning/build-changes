import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkn {
   public static bkp<biw> a(bry<?> $$0, int $$1) {
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$2 -> $$2.group($$2.a(bry.o), $$2.c(bry.aw), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
