import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxr {
   private static final float a = 0.3F;

   public static bwr<btn> a() {
      return byt.a(
         (Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$0 -> $$0.group($$0.a(ccr.m), $$0.a(ccr.n), $$0.b(ccr.e), $$0.b(ccr.h), $$0.c(ccr.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jh $$9 = $$0.b($$3);
                     cct $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> bsy.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> bsy.bj.equals($$1xx.ak()) && $$1xx.g((bss)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvr($$3xx, true));
                           $$1.a(new ccu(new bvr($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
