import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxx {
   public static bxz<bwf> a(cfj<?> $$0, int $$1) {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$2 -> $$2.group($$2.a(cfj.o), $$2.c(cfj.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
