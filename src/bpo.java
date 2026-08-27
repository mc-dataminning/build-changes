import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpo {
   public static bnn<blv> a(blj<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$2x -> $$2x.group($$2x.a(bux.n), $$2x.c(bux.q), $$2x.b(bux.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<blv> $$9 = $$2x.<buz>b($$5).a($$3xx -> $$3xx.f((blf)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        blv $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bnx($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
