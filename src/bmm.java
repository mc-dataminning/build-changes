import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmm {
   public static bkp<biw> a(biz $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag().f()), $$1);
   }

   public static bly<biw> a(bik<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag()), $$1);
   }

   public static bly<biw> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bly<biw> a(Predicate<biw> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$2x -> $$2x.group($$2x.c(bry.n), $$2x.b(bry.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<biw> $$8 = $$2x.<bsa>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((big)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bkz($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
