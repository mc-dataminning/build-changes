import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxi {
   public static bvk<btq> a(btt $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bwu<btq> a(btb<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bwu<btq> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwu<btq> a(Predicate<btq> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$2x -> $$2x.group($$2x.c(ccu.n), $$2x.b(ccu.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<btq> $$8 = $$2x.<ccw>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bsv)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvu($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
