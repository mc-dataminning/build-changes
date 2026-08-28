import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byh {
   public static byj<bwr> a(cft<?> $$0, int $$1) {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$2 -> $$2.group($$2.a(cft.p), $$2.c(cft.ay), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
