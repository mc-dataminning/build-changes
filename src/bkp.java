import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkp {
   public static bkr<biy> a(bsa<?> $$0, int $$1) {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$2 -> $$2.group($$2.a(bsa.o), $$2.c(bsa.aw), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
