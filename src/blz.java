import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blz {
   public static bmb<bkj> a(btk<?> $$0, int $$1) {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$2 -> $$2.group($$2.a(btk.o), $$2.c(btk.aw), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
