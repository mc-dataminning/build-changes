import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbm {
   public static bzo<bxw> a(bxz $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.an().f()), $$1);
   }

   public static cay<bxw> a(bxe<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.an()), $$1);
   }

   public static cay<bxw> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static cay<bxw> a(Predicate<bxw> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$2x -> $$2x.group($$2x.c(cgy.o), $$2x.b(cgy.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bxw> $$8 = $$2x.<cha>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g($$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bzy($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
