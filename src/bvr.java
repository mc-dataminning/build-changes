import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvr {
   public static btt<bsa> a(bsd $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bvd<bsa> a(brn<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bvd<bsa> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bvd<bsa> a(Predicate<bsa> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$2x -> $$2x.group($$2x.c(cbd.n), $$2x.b(cbd.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bsa> $$8 = $$2x.<cbf>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((brh)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bud($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
