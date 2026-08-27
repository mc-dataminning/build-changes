import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cdn {
   public static bnn<blv> a(int $$0) {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$1 -> $$1.group($$1.b(bux.K), $$1.c(bux.ac), $$1.c(bux.af), $$1.c(bux.ae))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$4x, $$5x, $$6) -> {
                     cbe $$7 = $$1.b($$2);
                     if (!cdi.a($$7.q())) {
                        return false;
                     } else {
                        $$3.a(true, (long)$$0);
                        return true;
                     }
                  }))
      );
   }
}
