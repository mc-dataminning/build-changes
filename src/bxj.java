import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxj {
   public static bvl<btr> a(btu $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bwv<btr> a(btc<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bwv<btr> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwv<btr> a(Predicate<btr> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$2x -> $$2x.group($$2x.c(ccv.n), $$2x.b(ccv.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<btr> $$8 = $$2x.<ccx>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bsw)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvv($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
