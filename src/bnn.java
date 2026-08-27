import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnn {
   private static final float a = 0.3F;

   public static bmn<bjm> a() {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$0 -> $$0.group($$0.a(bsn.m), $$0.a(bsn.n), $$0.b(bsn.e), $$0.b(bsn.h), $$0.c(bsn.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     hd $$9 = $$0.b($$3);
                     bsp $$10 = $$0.b($$4);
                     if ($$6.D_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.dj(), 4.0) && $$10.d($$0xxx -> bja.bf.equals($$0xxx.ag()))) {
                        $$10.a($$1xx -> bja.bf.equals($$1xx.ag()) && $$1xx.f((biw)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new blo($$3xx, true));
                           $$1.a(new bsq(new blo($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
