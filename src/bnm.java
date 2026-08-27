import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnm {
   public static bla<bji> a(Function<bji, Optional<bmm>> $$0, Predicate<bji> $$1, int $$2, int $$3, float $$4) {
      return bol.a(
         (Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$5 -> $$5.group($$5.a(bsj.n), $$5.a(bsj.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bmm> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bmm $$11 = $$10.get();
                        if ($$8.dj().a((hq)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bmm $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bsm($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
