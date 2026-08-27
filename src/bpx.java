import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpx {
   private static final float a = 0.3F;

   public static box<blv> a() {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$0 -> $$0.group($$0.a(bux.m), $$0.a(bux.n), $$0.b(bux.e), $$0.b(bux.h), $$0.c(bux.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     id $$9 = $$0.b($$3);
                     buz $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.ad() == $$9.a() && $$9.b().a($$7.dk(), 4.0) && $$10.d($$0xxx -> blj.bg.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> blj.bg.equals($$1xx.ai()) && $$1xx.f((blf)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bnx($$3xx, true));
                           $$1.a(new bva(new bnx($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
