import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqb {
   public static bod<bml> a(bmo $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bpn<bml> a(blz<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bpn<bml> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bpn<bml> a(Predicate<bml> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$2x -> $$2x.group($$2x.c(bvn.n), $$2x.b(bvn.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bml> $$8 = $$2x.<bvp>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((blv)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bon($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
