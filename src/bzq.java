import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzq {
   public static bxs<bvy> a(bwb $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static bzc<bvy> a(bvi<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static bzc<bvy> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bzc<bvy> a(Predicate<bvy> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$2x -> $$2x.group($$2x.c(cfc.n), $$2x.b(cfc.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bvy> $$8 = $$2x.<cfe>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bva)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new byc($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
