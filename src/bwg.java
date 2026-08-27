import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwg {
   public static bui<bso> a(bsr $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bvs<bso> a(bsa<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bvs<bso> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bvs<bso> a(Predicate<bso> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$2x -> $$2x.group($$2x.c(cbs.n), $$2x.b(cbs.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bso> $$8 = $$2x.<cbu>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bru)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bus($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
