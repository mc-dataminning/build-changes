import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzd {
   public static bxc<bvi> a(but<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$2x -> $$2x.group($$2x.a(cem.n), $$2x.c(cem.q), $$2x.b(cem.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvi> $$9 = $$2x.<ceo>b($$5).a($$3xx -> $$3xx.g((bum)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bvi $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bxm($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
