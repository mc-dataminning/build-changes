import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqo {
   public static bqq<box> a(bya<?> $$0, int $$1) {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$2 -> $$2.group($$2.a(bya.o), $$2.c(bya.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
