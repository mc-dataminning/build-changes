import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class brv {
   public static bpx<bog> a(boj $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static brh<bog> a(bnu<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static brh<bog> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static brh<bog> a(Predicate<bog> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$2x -> $$2x.group($$2x.c(bxh.n), $$2x.b(bxh.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bog> $$8 = $$2x.<bxj>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bno)$$6) <= (double)$$2 && !$$6.w($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bqh($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
