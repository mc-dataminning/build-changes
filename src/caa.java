import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caa {
   public static bxz<bwf> a(bvq<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$2x -> $$2x.group($$2x.a(cfj.n), $$2x.c(cfj.q), $$2x.b(cfj.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bwf> $$9 = $$2x.<cfl>b($$5).a($$3xx -> $$3xx.g((bvj)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bwf $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new byj($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
