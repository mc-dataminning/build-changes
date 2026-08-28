import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzm {
   public static bwz<bvf> a(Function<bvf, Optional<bym>> $$0, Predicate<bvf> $$1, int $$2, int $$3, float $$4) {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$5 -> $$5.group($$5.a(cej.n), $$5.a(cej.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bym> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bym $$11 = $$10.get();
                        if ($$8.du().a((kb)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bym $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cem($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
