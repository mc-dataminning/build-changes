import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxf {
   public static bvh<btn> a(btq $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bwr<btn> a(bsy<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bwr<btn> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwr<btn> a(Predicate<btn> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return byt.a(
         (Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$2x -> $$2x.group($$2x.c(ccr.n), $$2x.b(ccr.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<btn> $$8 = $$2x.<cct>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bss)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvr($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
