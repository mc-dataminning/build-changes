import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxv {
   public static bvi<bto> a(Function<bto, Optional<bwv>> $$0, Predicate<bto> $$1, int $$2, int $$3, float $$4) {
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$5 -> $$5.group($$5.a(ccs.n), $$5.a(ccs.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwv> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwv $$11 = $$10.get();
                        if ($$8.dn().a((js)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwv $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ccv($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
