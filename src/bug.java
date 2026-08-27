import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bug {
   public static bui<bso> a(cbs<?> $$0, int $$1) {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$2 -> $$2.group($$2.a(cbs.o), $$2.c(cbs.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
