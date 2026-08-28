import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bws {
   public static bwu<bva> a(cee<?> $$0, int $$1) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$2 -> $$2.group($$2.a(cee.o), $$2.c(cee.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
