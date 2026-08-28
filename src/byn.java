import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byn {
   public static bwp<buv> a(buy $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static bxz<buv> a(bug<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static bxz<buv> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bxz<buv> a(Predicate<buv> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$2x -> $$2x.group($$2x.c(cdz.n), $$2x.b(cdz.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<buv> $$8 = $$2x.<ceb>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((btz)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bwz($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
