import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxy {
   public static bya<bwg> a(cfk<?> $$0, int $$1) {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$2 -> $$2.group($$2.a(cfk.o), $$2.c(cfk.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
