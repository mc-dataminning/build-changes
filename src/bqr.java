import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqr {
   private static final int a = 36;

   public static bnn<blv> a() {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$0 -> $$0.group($$0.a(bux.x), $$0.a(bux.y), $$0.a(bux.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<blv>a($$2).filter($$1xx -> $$1xx.f((blf)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dO().a($$4.X(), $$4.W());
                     }

                     return true;
                  }))
      );
   }
}
