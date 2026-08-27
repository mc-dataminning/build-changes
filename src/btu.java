import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class btu {
   public static brh<bpo> a(Function<bpo, Optional<bsu>> $$0, Predicate<bpo> $$1, int $$2, int $$3, float $$4) {
      return but.a(
         (Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$5 -> $$5.group($$5.a(byr.n), $$5.a(byr.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bsu> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bsu $$11 = $$10.get();
                        if ($$8.dk().a((iv)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bsu $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new byu($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
