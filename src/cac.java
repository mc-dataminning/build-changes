import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cac {
   private static final float a = 0.3F;

   public static bzc<bvy> a() {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$0 -> $$0.group($$0.a(cfc.m), $$0.a(cfc.n), $$0.b(cfc.e), $$0.b(cfc.h), $$0.c(cfc.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jq $$9 = $$0.b($$3);
                     cfe $$10 = $$0.b($$4);
                     if ($$6.C_().a(100) == 0 && $$6.aj() == $$9.a() && $$9.b().a($$7.ds(), 4.0) && $$10.d($$0xxx -> bvi.bC.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bvi.bC.equals($$1xx.aq()) && $$1xx.g((bva)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new byc($$3xx, true));
                           $$1.a(new cff(new byc($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
