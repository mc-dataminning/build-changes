import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvw {
   public static bvy<buf> a(cdi<?> $$0, int $$1) {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$2 -> $$2.group($$2.a(cdi.o), $$2.c(cdi.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
