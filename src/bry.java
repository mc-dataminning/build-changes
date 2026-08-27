import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bry {
   public static bpx<bog> a(bnu<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$2x -> $$2x.group($$2x.a(bxh.n), $$2x.c(bxh.q), $$2x.b(bxh.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bog> $$9 = $$2x.<bxj>b($$5).a($$3xx -> $$3xx.f((bno)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bog $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bqh($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
