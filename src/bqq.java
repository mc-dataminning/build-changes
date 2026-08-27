import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqq {
   public static bod<bml> a(Function<bml, Optional<bpq>> $$0, Predicate<bml> $$1, int $$2, int $$3, float $$4) {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$5 -> $$5.group($$5.a(bvn.n), $$5.a(bvn.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bpq> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bpq $$11 = $$10.get();
                        if ($$8.dk().a((ir)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bpq $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bvq($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
