import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvh {
   private static final float a = 0.3F;

   public static buh<bre> a() {
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$0 -> $$0.group($$0.a(cah.m), $$0.a(cah.n), $$0.b(cah.e), $$0.b(cah.h), $$0.c(cah.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     iu $$9 = $$0.b($$3);
                     caj $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dl(), 4.0) && $$10.d($$0xxx -> bqr.bi.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bqr.bi.equals($$1xx.ai()) && $$1xx.g((bql)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bth($$3xx, true));
                           $$1.a(new cak(new bth($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
