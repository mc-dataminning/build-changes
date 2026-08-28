import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbj {
   public static byw<bxe> a(Function<bxe, Optional<caj>> $$0, Predicate<bxe> $$1, int $$2, int $$3, float $$4) {
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$5 -> $$5.group($$5.a(cgg.o), $$5.a(cgg.n))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<caj> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        caj $$11 = $$10.get();
                        if ($$8.dt().a((jo)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           caj $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cgj($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
