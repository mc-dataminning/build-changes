import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqt {
   public static bog<bmo> a(Function<bmo, Optional<bpt>> $$0, Predicate<bmo> $$1, int $$2, int $$3, float $$4) {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$5 -> $$5.group($$5.a(bvq.n), $$5.a(bvq.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bpt> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bpt $$11 = $$10.get();
                        if ($$8.dj().a((ir)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bpt $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bvt($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
