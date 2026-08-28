import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzw {
   public static bxv<bwb> a(bvm<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$2x -> $$2x.group($$2x.a(cff.n), $$2x.c(cff.q), $$2x.b(cff.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bwb> $$9 = $$2x.<cfh>b($$5).a($$3xx -> $$3xx.g((bvf)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bwb $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new byf($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
