import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnb {
   public static bkp<biw> a(Function<biw, Optional<bmb>> $$0, Predicate<biw> $$1, int $$2, int $$3, float $$4) {
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$5 -> $$5.group($$5.a(bry.n), $$5.a(bry.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bmb> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bmb $$11 = $$10.get();
                        if ($$8.di().a((hp)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bmb $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bsb($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
