import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class caf {
   public static bxs<bvy> a(Function<bvy, Optional<bzf>> $$0, Predicate<bvy> $$1, int $$2, int $$3, float $$4) {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$5 -> $$5.group($$5.a(cfc.n), $$5.a(cfc.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bzf> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bzf $$11 = $$10.get();
                        if ($$8.ds().a((kb)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bzf $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cff($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
