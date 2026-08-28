import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzk {
   public static bzm<bxu> a(cgw<?> $$0, int $$1) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$2 -> $$2.group($$2.a(cgw.p), $$2.c(cgw.ay), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
