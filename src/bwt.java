import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwt {
   public static buv<btb> a(bte $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.al().f()), $$1);
   }

   public static bwf<btb> a(bsm<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.al()), $$1);
   }

   public static bwf<btb> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwf<btb> a(Predicate<btb> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$2x -> $$2x.group($$2x.c(ccf.n), $$2x.b(ccf.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<btb> $$8 = $$2x.<cch>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bsg)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvf($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
