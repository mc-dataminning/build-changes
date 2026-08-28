import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxw {
   public static bvy<buf> a(bui $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ao().f()), $$1);
   }

   public static bxi<buf> a(btq<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ao()), $$1);
   }

   public static bxi<buf> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bxi<buf> a(Predicate<buf> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$2x -> $$2x.group($$2x.c(cdi.n), $$2x.b(cdi.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<buf> $$8 = $$2x.<cdk>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((btj)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bwi($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
