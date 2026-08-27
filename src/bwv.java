import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwv {
   public static bui<bso> a(Function<bso, Optional<bvv>> $$0, Predicate<bso> $$1, int $$2, int $$3, float $$4) {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$5 -> $$5.group($$5.a(cbs.n), $$5.a(cbs.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bvv> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bvv $$11 = $$10.get();
                        if ($$8.dn().a((jh)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bvv $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cbv($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
