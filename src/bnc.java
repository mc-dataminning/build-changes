import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnc {
   public static bkq<biy> a(Function<biy, Optional<bmc>> $$0, Predicate<biy> $$1, int $$2, int $$3, float $$4) {
      return bob.a(
         (Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$5 -> $$5.group($$5.a(brz.n), $$5.a(brz.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bmc> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bmc $$11 = $$10.get();
                        if ($$8.di().a((ho)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bmc $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bsc($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
