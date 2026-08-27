import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bui {
   public static buk<bsq> a(cbu<?> $$0, int $$1) {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$2 -> $$2.group($$2.a(cbu.o), $$2.c(cbu.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
