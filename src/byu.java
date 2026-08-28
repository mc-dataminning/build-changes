import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byu {
   public static byw<bxe> a(cgg<?> $$0, int $$1) {
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$2 -> $$2.group($$2.a(cgg.p), $$2.c(cgg.ay), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
