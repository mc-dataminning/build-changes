import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxf {
   public static bus<bsy> a(Function<bsy, Optional<bwf>> $$0, Predicate<bsy> $$1, int $$2, int $$3, float $$4) {
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$5 -> $$5.group($$5.a(ccc.n), $$5.a(ccc.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwf> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwf $$11 = $$10.get();
                        if ($$8.dn().a((jt)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwf $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ccf($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
