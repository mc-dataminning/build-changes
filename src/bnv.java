import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnv {
   public static bnx<bmf> a(bvh<?> $$0, int $$1) {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$2 -> $$2.group($$2.a(bvh.o), $$2.c(bvh.aw), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
