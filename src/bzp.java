import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzp {
   public static bxr<bvx> a(bwa $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static bzb<bvx> a(bvi<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static bzb<bvx> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bzb<bvx> a(Predicate<bvx> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$2x -> $$2x.group($$2x.c(cfb.n), $$2x.b(cfb.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bvx> $$8 = $$2x.<cfd>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bvb)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new byb($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
