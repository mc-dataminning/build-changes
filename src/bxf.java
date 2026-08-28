import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxf {
   private static final float a = 0.3F;

   public static bwf<btb> a() {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$0 -> $$0.group($$0.a(ccf.m), $$0.a(ccf.n), $$0.b(ccf.e), $$0.b(ccf.h), $$0.c(ccf.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ji $$9 = $$0.b($$3);
                     cch $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.do(), 4.0) && $$10.d($$0xxx -> bsm.bj.equals($$0xxx.al()))) {
                        $$10.a($$1xx -> bsm.bj.equals($$1xx.al()) && $$1xx.g((bsg)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvf($$3xx, true));
                           $$1.a(new cci(new bvf($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
