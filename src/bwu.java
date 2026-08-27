import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwu {
   private static final float a = 0.3F;

   public static bvu<bsq> a() {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$0 -> $$0.group($$0.a(cbu.m), $$0.a(cbu.n), $$0.b(cbu.e), $$0.b(cbu.h), $$0.c(cbu.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     iw $$9 = $$0.b($$3);
                     cbw $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> bsc.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> bsc.bj.equals($$1xx.ak()) && $$1xx.g((brw)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new buu($$3xx, true));
                           $$1.a(new cbx(new buu($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
