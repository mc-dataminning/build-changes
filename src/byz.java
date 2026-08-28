import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byz {
   public static bzb<bxj> a(cgl<?> $$0, int $$1) {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$2 -> $$2.group($$2.a(cgl.p), $$2.c(cgl.ay), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
