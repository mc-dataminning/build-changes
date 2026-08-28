import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class caz {
   public static bzb<bxj> a(bxm $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.an().f()), $$1);
   }

   public static cal<bxj> a(bwr<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.an()), $$1);
   }

   public static cal<bxj> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static cal<bxj> a(Predicate<bxj> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$2x -> $$2x.group($$2x.c(cgl.o), $$2x.b(cgl.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bxj> $$8 = $$2x.<cgn>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g($$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bzl($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
