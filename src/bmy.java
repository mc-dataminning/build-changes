import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmy {
   private static final float a = 0.3F;

   public static bly<biw> a() {
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$0 -> $$0.group($$0.a(bry.m), $$0.a(bry.n), $$0.b(bry.e), $$0.b(bry.h), $$0.c(bry.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     he $$9 = $$0.b($$3);
                     bsa $$10 = $$0.b($$4);
                     if ($$6.y_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.di(), 4.0) && $$10.d($$0xxx -> bik.bf.equals($$0xxx.ag()))) {
                        $$10.a($$1xx -> bik.bf.equals($$1xx.ag()) && $$1xx.f((big)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bkz($$3xx, true));
                           $$1.a(new bsb(new bkz($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
