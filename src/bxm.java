import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxm {
   public static bvl<btr> a(btc<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$2x -> $$2x.group($$2x.a(ccv.n), $$2x.c(ccv.q), $$2x.b(ccv.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btr> $$9 = $$2x.<ccx>b($$5).a($$3xx -> $$3xx.g((bsw)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btr $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvv($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
