import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxx {
   public static bvk<btq> a(Function<btq, Optional<bwx>> $$0, Predicate<btq> $$1, int $$2, int $$3, float $$4) {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$5 -> $$5.group($$5.a(ccu.n), $$5.a(ccu.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwx> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwx $$11 = $$10.get();
                        if ($$8.dn().a((js)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwx $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ccx($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
