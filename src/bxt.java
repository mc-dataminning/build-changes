import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxt {
   private static final float a = 0.3F;

   public static bwt<btp> a() {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$0 -> $$0.group($$0.a(cct.m), $$0.a(cct.n), $$0.b(cct.e), $$0.b(cct.h), $$0.c(cct.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jh $$9 = $$0.b($$3);
                     ccv $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> bta.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> bta.bj.equals($$1xx.ak()) && $$1xx.g((bsu)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvt($$3xx, true));
                           $$1.a(new ccw(new bvt($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
