import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxg {
   public static bvi<bto> a(btr $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bws<bto> a(bsz<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bws<bto> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bws<bto> a(Predicate<bto> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$2x -> $$2x.group($$2x.c(ccs.n), $$2x.b(ccs.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bto> $$8 = $$2x.<ccu>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bst)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvs($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
