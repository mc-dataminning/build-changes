import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpl {
   public static bnn<blv> a(bly $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static box<blv> a(blj<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static box<blv> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static box<blv> a(Predicate<blv> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$2x -> $$2x.group($$2x.c(bux.n), $$2x.b(bux.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<blv> $$8 = $$2x.<buz>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((blf)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bnx($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
