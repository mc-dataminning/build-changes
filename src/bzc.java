import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzc {
   private static final int a = 36;

   public static bvy<buf> a() {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$0 -> $$0.group($$0.a(cdi.x), $$0.a(cdi.y), $$0.a(cdi.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<buf>a($$2).filter($$1xx -> $$1xx.g((btj)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dX().a($$4.ab(), $$4.aa());
                     }

                     return true;
                  }))
      );
   }
}
