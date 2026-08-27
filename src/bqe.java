import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqe {
   public static bod<bml> a(blz<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$2x -> $$2x.group($$2x.a(bvn.n), $$2x.c(bvn.q), $$2x.b(bvn.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bml> $$9 = $$2x.<bvp>b($$5).a($$3xx -> $$3xx.f((blv)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bml $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bon($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
