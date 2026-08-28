import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bww {
   public static buv<btb> a(bsm<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$2x -> $$2x.group($$2x.a(ccf.n), $$2x.c(ccf.q), $$2x.b(ccf.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btb> $$9 = $$2x.<cch>b($$5).a($$3xx -> $$3xx.g((bsg)$$7) <= (double)$$2 && $$0.equals($$3xx.al()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btb $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvf($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
