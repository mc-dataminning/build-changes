import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxu {
   private static final float a = 0.3F;

   public static bwu<btq> a() {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$0 -> $$0.group($$0.a(ccu.m), $$0.a(ccu.n), $$0.b(ccu.e), $$0.b(ccu.h), $$0.c(ccu.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jh $$9 = $$0.b($$3);
                     ccw $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> btb.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> btb.bj.equals($$1xx.ak()) && $$1xx.g((bsv)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvu($$3xx, true));
                           $$1.a(new ccx(new bvu($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
