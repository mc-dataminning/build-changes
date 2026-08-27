import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bon {
   public static bmq<bky> a(blb $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag().f()), $$1);
   }

   public static bnz<bky> a(bkm<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag()), $$1);
   }

   public static bnz<bky> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bnz<bky> a(Predicate<bky> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$2x -> $$2x.group($$2x.c(btz.n), $$2x.b(btz.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bky> $$8 = $$2x.<bub>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bki)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bna($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
