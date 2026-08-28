import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbz {
   public static bzm<bxu> a(Function<bxu, Optional<caz>> $$0, Predicate<bxu> $$1, int $$2, int $$3, float $$4) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$5 -> $$5.group($$5.a(cgw.o), $$5.a(cgw.n))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<caz> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        caz $$11 = $$10.get();
                        if ($$8.dt().a((jp)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           caz $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cgz($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
