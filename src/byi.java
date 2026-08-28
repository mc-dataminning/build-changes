import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byi {
   private static final float a = 0.3F;

   public static bxi<buf> a() {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$0 -> $$0.group($$0.a(cdi.m), $$0.a(cdi.n), $$0.b(cdi.e), $$0.b(cdi.h), $$0.c(cdi.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jm $$9 = $$0.b($$3);
                     cdk $$10 = $$0.b($$4);
                     if ($$6.C_().a(100) == 0 && $$6.ag() == $$9.a() && $$9.b().a($$7.dq(), 4.0) && $$10.d($$0xxx -> btq.bj.equals($$0xxx.ao()))) {
                        $$10.a($$1xx -> btq.bj.equals($$1xx.ao()) && $$1xx.g((btj)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bwi($$3xx, true));
                           $$1.a(new cdl(new bwi($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
