import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnc {
   private static final float a = 0.3F;

   public static bmc<bjb> a() {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$0 -> $$0.group($$0.a(bsc.m), $$0.a(bsc.n), $$0.b(bsc.e), $$0.b(bsc.h), $$0.c(bsc.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     hf $$9 = $$0.b($$3);
                     bse $$10 = $$0.b($$4);
                     if ($$6.y_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.di(), 4.0) && $$10.d($$0xxx -> bip.bf.equals($$0xxx.ag()))) {
                        $$10.a($$1xx -> bip.bf.equals($$1xx.ag()) && $$1xx.f((bil)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bld($$3xx, true));
                           $$1.a(new bsf(new bld($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
