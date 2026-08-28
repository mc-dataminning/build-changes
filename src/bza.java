import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bza {
   public static bwz<bvf> a(buq<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$2x -> $$2x.group($$2x.a(cej.n), $$2x.c(cej.q), $$2x.b(cej.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvf> $$9 = $$2x.<cel>b($$5).a($$3xx -> $$3xx.g((buj)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bvf $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bxj($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
