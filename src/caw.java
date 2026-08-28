import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caw {
   private static final int a = 36;

   public static bxs<bvy> a() {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$0 -> $$0.group($$0.a(cfc.x), $$0.a(cfc.y), $$0.a(cfc.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bvy>a($$2).filter($$1xx -> $$1xx.g((bva)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.ea().a($$4.af(), $$4.ae());
                     }

                     return true;
                  }))
      );
   }
}
