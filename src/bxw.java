import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxw {
   public static bvj<btp> a(Function<btp, Optional<bww>> $$0, Predicate<btp> $$1, int $$2, int $$3, float $$4) {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$5 -> $$5.group($$5.a(cct.n), $$5.a(cct.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bww> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bww $$11 = $$10.get();
                        if ($$8.dn().a((js)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bww $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ccw($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
