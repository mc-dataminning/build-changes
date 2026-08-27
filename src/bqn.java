import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqn {
   private static final float a = 0.3F;

   public static bpn<bml> a() {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$0 -> $$0.group($$0.a(bvn.m), $$0.a(bvn.n), $$0.b(bvn.e), $$0.b(bvn.h), $$0.c(bvn.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ig $$9 = $$0.b($$3);
                     bvp $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dk(), 4.0) && $$10.d($$0xxx -> blz.bg.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> blz.bg.equals($$1xx.ai()) && $$1xx.f((blv)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bon($$3xx, true));
                           $$1.a(new bvq(new bon($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
