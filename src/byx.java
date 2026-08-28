import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byx {
   public static bwz<bvf> a(bvi $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static byj<bvf> a(buq<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static byj<bvf> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static byj<bvf> a(Predicate<bvf> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$2x -> $$2x.group($$2x.c(cej.n), $$2x.b(cej.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bvf> $$8 = $$2x.<cel>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((buj)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bxj($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
