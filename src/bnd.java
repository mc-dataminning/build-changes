import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnd {
   public static bkr<biy> a(Function<biy, Optional<bmd>> $$0, Predicate<biy> $$1, int $$2, int $$3, float $$4) {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$5 -> $$5.group($$5.a(bsa.n), $$5.a(bsa.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bmd> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bmd $$11 = $$10.get();
                        if ($$8.di().a((ho)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bmd $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bsd($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
