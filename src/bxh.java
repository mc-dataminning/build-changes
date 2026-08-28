import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxh {
   public static bvg<btl> a(bsw<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$2x -> $$2x.group($$2x.a(ccq.n), $$2x.c(ccq.q), $$2x.b(ccq.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btl> $$9 = $$2x.<ccs>b($$5).a($$3xx -> $$3xx.g((bsq)$$7) <= (double)$$2 && $$0.equals($$3xx.am()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btl $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvq($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
