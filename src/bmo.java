import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmo {
   public static bmq<bky> a(btz<?> $$0, int $$1) {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$2 -> $$2.group($$2.a(btz.o), $$2.c(btz.aw), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
