import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpv {
   public static bnx<bmf> a(bmi $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bph<bmf> a(blt<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bph<bmf> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bph<bmf> a(Predicate<bmf> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$2x -> $$2x.group($$2x.c(bvh.n), $$2x.b(bvh.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bmf> $$8 = $$2x.<bvj>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((blp)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new boh($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
