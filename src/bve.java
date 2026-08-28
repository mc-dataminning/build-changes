import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bve {
   public static bvg<btl> a(ccq<?> $$0, int $$1) {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$2 -> $$2.group($$2.a(ccq.o), $$2.c(ccq.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
