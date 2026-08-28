import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxc {
   public static bve<btk> a(btn $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bwo<btk> a(bsv<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bwo<btk> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwo<btk> a(Predicate<btk> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$2x -> $$2x.group($$2x.c(cco.n), $$2x.b(cco.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<btk> $$8 = $$2x.<ccq>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bsp)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvo($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
