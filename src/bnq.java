import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnq {
   public static ble<bjm> a(Function<bjm, Optional<bmq>> $$0, Predicate<bjm> $$1, int $$2, int $$3, float $$4) {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$5 -> $$5.group($$5.a(bsn.n), $$5.a(bsn.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bmq> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bmq $$11 = $$10.get();
                        if ($$8.dj().a((ho)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bmq $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bsq($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
