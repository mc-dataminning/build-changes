import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boz {
   private static final float a = 0.3F;

   public static bnz<bky> a() {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$0 -> $$0.group($$0.a(btz.m), $$0.a(btz.n), $$0.b(btz.e), $$0.b(btz.h), $$0.c(btz.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ia $$9 = $$0.b($$3);
                     bub $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.dj(), 4.0) && $$10.d($$0xxx -> bkm.bf.equals($$0xxx.ag()))) {
                        $$10.a($$1xx -> bkm.bf.equals($$1xx.ag()) && $$1xx.f((bki)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bna($$3xx, true));
                           $$1.a(new buc(new bna($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
