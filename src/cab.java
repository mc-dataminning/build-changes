import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cab {
   private static final float a = 0.3F;

   public static bzb<bvx> a() {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$0 -> $$0.group($$0.a(cfb.m), $$0.a(cfb.n), $$0.b(cfb.e), $$0.b(cfb.h), $$0.c(cfb.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jp $$9 = $$0.b($$3);
                     cfd $$10 = $$0.b($$4);
                     if ($$6.H_().a(100) == 0 && $$6.ai() == $$9.a() && $$9.b().a($$7.du(), 4.0) && $$10.d($$0xxx -> bvi.bD.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bvi.bD.equals($$1xx.aq()) && $$1xx.g((bvb)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new byb($$3xx, true));
                           $$1.a(new cfe(new byb($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
