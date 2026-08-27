import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmp {
   public static bkp<biw> a(bik<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$2x -> $$2x.group($$2x.a(bry.n), $$2x.c(bry.q), $$2x.b(bry.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<biw> $$9 = $$2x.<bsa>b($$5).a($$3xx -> $$3xx.f((big)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        biw $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bkz($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
