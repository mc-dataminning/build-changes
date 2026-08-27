import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpa {
   public static bnd<bll> a(blo $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bom<bll> a(bkz<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bom<bll> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bom<bll> a(Predicate<bll> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$2x -> $$2x.group($$2x.c(bum.n), $$2x.b(bum.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bll> $$8 = $$2x.<buo>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bkv)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bnn($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
