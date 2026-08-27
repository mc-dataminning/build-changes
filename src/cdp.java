import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdp<E extends cdh> {
   public static bnn<blv> a(int $$0) {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$1 -> $$1.group($$1.b(bux.ac), $$1.a(bux.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eU().b()) {
                        return false;
                     } else {
                        Optional<cbe> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
