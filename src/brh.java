import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brh {
   private static final int a = 36;

   public static bod<bml> a() {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$0 -> $$0.group($$0.a(bvn.x), $$0.a(bvn.y), $$0.a(bvn.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bml>a($$2).filter($$1xx -> $$1xx.f((blv)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dO().a($$4.Y(), $$4.X());
                     }

                     return true;
                  }))
      );
   }
}
