import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvc {
   public static bve<btk> a(cco<?> $$0, int $$1) {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$2 -> $$2.group($$2.a(cco.o), $$2.c(cco.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
