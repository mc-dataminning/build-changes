import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buf {
   public static bvs<bsq> a(int $$0, float $$1) {
      return bxu.a(
         (Function<bxu.b<bsq>, ? extends App<bxu.c<bsq>, bxx<bsq>>>)($$2 -> $$2.group($$2.c(cbs.m), $$2.a(cbs.n), $$2.b(cbs.o), $$2.b(cbs.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bso $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cbu>b($$6).a($$9)) {
                        $$4.a(new bus($$9, true));
                        $$7.H().a(-$$1, 0.0F);
                        $$7.r(ayd.c($$7.dF(), $$7.bb, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
