import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpp {
   public static bnd<bll> a(Function<bll, Optional<bop>> $$0, Predicate<bll> $$1, int $$2, int $$3, float $$4) {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$5 -> $$5.group($$5.a(bum.n), $$5.a(bum.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bop> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bop $$11 = $$10.get();
                        if ($$8.dl().a((iq)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bop $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bup($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
