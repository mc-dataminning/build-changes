import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxt {
   public static bxv<bwb> a(cff<?> $$0, int $$1) {
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$2 -> $$2.group($$2.a(cff.o), $$2.c(cff.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
