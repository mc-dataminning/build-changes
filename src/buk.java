import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class buk {
   public static bsm<bqt> a(bqw $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static btw<bqt> a(bqg<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static btw<bqt> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static btw<bqt> a(Predicate<bqt> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$2x -> $$2x.group($$2x.c(bzw.n), $$2x.b(bzw.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bqt> $$8 = $$2x.<bzy>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bqa)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bsw($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
