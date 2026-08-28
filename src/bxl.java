import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxl {
   public static bvk<btq> a(btb<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$2x -> $$2x.group($$2x.a(ccu.n), $$2x.c(ccu.q), $$2x.b(ccu.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btq> $$9 = $$2x.<ccw>b($$5).a($$3xx -> $$3xx.g((bsv)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btq $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvu($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
