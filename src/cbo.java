import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbo {
   public static bzb<bxj> a(Function<bxj, Optional<cao>> $$0, Predicate<bxj> $$1, int $$2, int $$3, float $$4) {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$5 -> $$5.group($$5.a(cgl.o), $$5.a(cgl.n))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<cao> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        cao $$11 = $$10.get();
                        if ($$8.ds().a((jp)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           cao $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cgo($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
