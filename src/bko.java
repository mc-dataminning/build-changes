import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bko {
   public static bkq<biy> a(brz<?> $$0, int $$1) {
      return bob.a(
         (Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$2 -> $$2.group($$2.a(brz.o), $$2.c(brz.aw), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
