import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bza {
   public static bxc<bvi> a(bvl $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static bym<bvi> a(but<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static bym<bvi> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bym<bvi> a(Predicate<bvi> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$2x -> $$2x.group($$2x.c(cem.n), $$2x.b(cem.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bvi> $$8 = $$2x.<ceo>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bum)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bxm($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
