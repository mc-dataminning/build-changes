import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cab {
   public static bya<bwg> a(bvr<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$2x -> $$2x.group($$2x.a(cfk.n), $$2x.c(cfk.q), $$2x.b(cfk.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bwg> $$9 = $$2x.<cfm>b($$5).a($$3xx -> $$3xx.g((bvk)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bwg $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new byk($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
