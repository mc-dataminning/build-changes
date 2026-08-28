import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvh {
   public static bvj<btp> a(cct<?> $$0, int $$1) {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$2 -> $$2.group($$2.a(cct.o), $$2.c(cct.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
