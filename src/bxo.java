import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxo {
   private static final float a = 0.3F;

   public static bwo<btk> a() {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$0 -> $$0.group($$0.a(cco.m), $$0.a(cco.n), $$0.b(cco.e), $$0.b(cco.h), $$0.c(cco.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jh $$9 = $$0.b($$3);
                     ccq $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> bsv.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> bsv.bj.equals($$1xx.ak()) && $$1xx.g((bsp)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvo($$3xx, true));
                           $$1.a(new ccr(new bvo($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
