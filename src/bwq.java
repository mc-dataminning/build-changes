import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwq {
   public static bus<bsy> a(btb $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bwc<bsy> a(bsj<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bwc<bsy> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwc<bsy> a(Predicate<bsy> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$2x -> $$2x.group($$2x.c(ccc.n), $$2x.b(ccc.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bsy> $$8 = $$2x.<cce>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bsd)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvc($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
