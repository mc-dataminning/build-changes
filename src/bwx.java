import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwx {
   public static buw<btc> a(bsn<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$2x -> $$2x.group($$2x.a(ccg.n), $$2x.c(ccg.q), $$2x.b(ccg.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btc> $$9 = $$2x.<cci>b($$5).a($$3xx -> $$3xx.g((bsh)$$7) <= (double)$$2 && $$0.equals($$3xx.am()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btc $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvg($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
