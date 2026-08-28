import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class ccb {
   public static bzo<bxw> a(Function<bxw, Optional<cbb>> $$0, Predicate<bxw> $$1, int $$2, int $$3, float $$4) {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$5 -> $$5.group($$5.a(cgy.o), $$5.a(cgy.n))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<cbb> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        cbb $$11 = $$10.get();
                        if ($$8.dt().a((jq)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           cbb $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new chb($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
