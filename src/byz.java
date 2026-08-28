import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byz {
   public static bxb<bvh> a(bvk $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static byl<bvh> a(bus<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static byl<bvh> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static byl<bvh> a(Predicate<bvh> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$2x -> $$2x.group($$2x.c(cel.n), $$2x.b(cel.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bvh> $$8 = $$2x.<cen>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bul)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bxl($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
