import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxr {
   public static bve<btk> a(Function<btk, Optional<bwr>> $$0, Predicate<btk> $$1, int $$2, int $$3, float $$4) {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$5 -> $$5.group($$5.a(cco.n), $$5.a(cco.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwr> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwr $$11 = $$10.get();
                        if ($$8.dn().a((js)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwr $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ccr($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
