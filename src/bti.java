import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bti {
   public static brh<bpo> a(bpc<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return but.a(
         (Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$2x -> $$2x.group($$2x.a(byr.n), $$2x.c(byr.q), $$2x.b(byr.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bpo> $$9 = $$2x.<byt>b($$5).a($$3xx -> $$3xx.g((bow)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bpo $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new brr($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
