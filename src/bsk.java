import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsk {
   public static bsm<bqt> a(bzw<?> $$0, int $$1) {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$2 -> $$2.group($$2.a(bzw.o), $$2.c(bzw.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
