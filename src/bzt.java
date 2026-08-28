import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzt {
   public static bxs<bvy> a(bvi<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$2x -> $$2x.group($$2x.a(cfc.n), $$2x.c(cfc.q), $$2x.b(cfc.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvy> $$9 = $$2x.<cfe>b($$5).a($$3xx -> $$3xx.g((bva)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bvy $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new byc($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
