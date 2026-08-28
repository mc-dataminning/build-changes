import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzm {
   public static bzo<bxw> a(cgy<?> $$0, int $$1) {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$2 -> $$2.group($$2.a(cgy.p), $$2.c(cgy.ay), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
