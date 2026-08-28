import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzx {
   public static bxz<bwf> a(bwi $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static bzj<bwf> a(bvq<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static bzj<bwf> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bzj<bwf> a(Predicate<bwf> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$2x -> $$2x.group($$2x.c(cfj.n), $$2x.b(cfj.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bwf> $$8 = $$2x.<cfl>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bvj)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new byj($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
