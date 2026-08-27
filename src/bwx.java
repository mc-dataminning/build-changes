import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwx {
   public static buk<bsq> a(Function<bsq, Optional<bvx>> $$0, Predicate<bsq> $$1, int $$2, int $$3, float $$4) {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$5 -> $$5.group($$5.a(cbu.n), $$5.a(cbu.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bvx> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bvx $$11 = $$10.get();
                        if ($$8.dn().a((jh)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bvx $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cbx($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
