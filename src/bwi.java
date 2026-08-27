import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwi {
   public static buk<bsq> a(bst $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bvu<bsq> a(bsc<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bvu<bsq> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bvu<bsq> a(Predicate<bsq> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$2x -> $$2x.group($$2x.c(cbu.n), $$2x.b(cbu.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bsq> $$8 = $$2x.<cbw>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((brw)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new buu($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
