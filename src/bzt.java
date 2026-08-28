import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzt {
   public static bxv<bwb> a(bwe $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static bzf<bwb> a(bvm<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static bzf<bwb> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bzf<bwb> a(Predicate<bwb> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$2x -> $$2x.group($$2x.c(cff.n), $$2x.b(cff.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bwb> $$8 = $$2x.<cfh>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bvf)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new byf($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
