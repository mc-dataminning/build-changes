import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bws {
   private static final float a = 0.3F;

   public static bvs<bso> a() {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$0 -> $$0.group($$0.a(cbs.m), $$0.a(cbs.n), $$0.b(cbs.e), $$0.b(cbs.h), $$0.c(cbs.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     iw $$9 = $$0.b($$3);
                     cbu $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> bsa.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> bsa.bj.equals($$1xx.ak()) && $$1xx.g((bru)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bus($$3xx, true));
                           $$1.a(new cbv(new bus($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
