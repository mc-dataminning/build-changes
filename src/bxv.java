import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxv {
   private static final float a = 0.3F;

   public static bwv<btr> a() {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$0 -> $$0.group($$0.a(ccv.m), $$0.a(ccv.n), $$0.b(ccv.e), $$0.b(ccv.h), $$0.c(ccv.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jh $$9 = $$0.b($$3);
                     ccx $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> btc.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> btc.bj.equals($$1xx.ak()) && $$1xx.g((bsw)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvv($$3xx, true));
                           $$1.a(new ccy(new bvv($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
