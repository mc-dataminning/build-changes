import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxy {
   public static bvl<btr> a(Function<btr, Optional<bwy>> $$0, Predicate<btr> $$1, int $$2, int $$3, float $$4) {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$5 -> $$5.group($$5.a(ccv.n), $$5.a(ccv.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwy> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwy $$11 = $$10.get();
                        if ($$8.dn().a((js)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwy $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ccy($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
