import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzc {
   public static bxb<bvh> a(bus<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$2x -> $$2x.group($$2x.a(cel.n), $$2x.c(cel.q), $$2x.b(cel.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvh> $$9 = $$2x.<cen>b($$5).a($$3xx -> $$3xx.g((bul)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bvh $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bxl($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
