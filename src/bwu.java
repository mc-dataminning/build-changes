import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwu {
   public static buw<btc> a(btf $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.am().f()), $$1);
   }

   public static bwg<btc> a(bsn<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.am()), $$1);
   }

   public static bwg<btc> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwg<btc> a(Predicate<btc> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$2x -> $$2x.group($$2x.c(ccg.n), $$2x.b(ccg.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<btc> $$8 = $$2x.<cci>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bsh)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvg($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
