import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxj {
   public static buw<btc> a(Function<btc, Optional<bwj>> $$0, Predicate<btc> $$1, int $$2, int $$3, float $$4) {
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$5 -> $$5.group($$5.a(ccg.n), $$5.a(ccg.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwj> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwj $$11 = $$10.get();
                        if ($$8.dp().a((jt)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwj $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ccj($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
