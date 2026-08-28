import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byz {
   private static final float a = 0.3F;

   public static bxz<buv> a() {
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$0 -> $$0.group($$0.a(cdz.m), $$0.a(cdz.n), $$0.b(cdz.e), $$0.b(cdz.h), $$0.c(cdz.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jo $$9 = $$0.b($$3);
                     ceb $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ag() == $$9.a() && $$9.b().a($$7.dv(), 4.0) && $$10.d($$0xxx -> bug.bj.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bug.bj.equals($$1xx.aq()) && $$1xx.g((btz)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bwz($$3xx, true));
                           $$1.a(new cec(new bwz($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
