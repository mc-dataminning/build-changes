import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cah {
   public static byj<bwr> a(bwu $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static bzt<bwr> a(bwb<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static bzt<bwr> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bzt<bwr> a(Predicate<bwr> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$2x -> $$2x.group($$2x.c(cft.o), $$2x.b(cft.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bwr> $$8 = $$2x.<cfv>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bvs)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new byt($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
