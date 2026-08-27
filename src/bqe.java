import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqe {
   public static bog<bmo> a(bmr $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bpq<bmo> a(bmc<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bpq<bmo> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bpq<bmo> a(Predicate<bmo> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$2x -> $$2x.group($$2x.c(bvq.n), $$2x.b(bvq.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bmo> $$8 = $$2x.<bvs>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((blw)$$6) <= (double)$$2 && !$$6.w($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new boq($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
