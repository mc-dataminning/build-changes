import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bok {
   private static final float a = 0.3F;

   public static bnk<bkj> a() {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$0 -> $$0.group($$0.a(btk.m), $$0.a(btk.n), $$0.b(btk.e), $$0.b(btk.h), $$0.c(btk.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ia $$9 = $$0.b($$3);
                     btm $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.dj(), 4.0) && $$10.d($$0xxx -> bjx.bf.equals($$0xxx.ag()))) {
                        $$10.a($$1xx -> bjx.bf.equals($$1xx.ag()) && $$1xx.f((bjt)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bml($$3xx, true));
                           $$1.a(new btn(new bml($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
