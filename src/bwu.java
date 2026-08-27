import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwu {
   public static buh<bso> a(Function<bso, Optional<bvu>> $$0, Predicate<bso> $$1, int $$2, int $$3, float $$4) {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$5 -> $$5.group($$5.a(cbr.n), $$5.a(cbr.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bvu> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bvu $$11 = $$10.get();
                        if ($$8.ds().a((jk)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bvu $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cbu($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
