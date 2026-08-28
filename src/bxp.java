import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxp {
   public static bxr<bvx> a(cfb<?> $$0, int $$1) {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$2 -> $$2.group($$2.a(cfb.o), $$2.c(cfb.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
