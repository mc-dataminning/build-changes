import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxu {
   public static bvh<btn> a(Function<btn, Optional<bwu>> $$0, Predicate<btn> $$1, int $$2, int $$3, float $$4) {
      return byt.a(
         (Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$5 -> $$5.group($$5.a(ccr.n), $$5.a(ccr.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwu> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwu $$11 = $$10.get();
                        if ($$8.dn().a((js)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwu $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ccu($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
