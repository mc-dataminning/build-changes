import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzy {
   public static bya<bwg> a(bwj $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static bzk<bwg> a(bvr<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static bzk<bwg> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bzk<bwg> a(Predicate<bwg> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$2x -> $$2x.group($$2x.c(cfk.n), $$2x.b(cfk.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bwg> $$8 = $$2x.<cfm>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bvk)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new byk($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
