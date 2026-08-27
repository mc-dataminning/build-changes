import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bna {
   private static final float a = 0.3F;

   public static bma<biy> a() {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$0 -> $$0.group($$0.a(bsa.m), $$0.a(bsa.n), $$0.b(bsa.e), $$0.b(bsa.h), $$0.c(bsa.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     hd $$9 = $$0.b($$3);
                     bsc $$10 = $$0.b($$4);
                     if ($$6.y_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.di(), 4.0) && $$10.d($$0xxx -> bim.bf.equals($$0xxx.ag()))) {
                        $$10.a($$1xx -> bim.bf.equals($$1xx.ag()) && $$1xx.f((bii)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new blb($$3xx, true));
                           $$1.a(new bsd(new blb($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
