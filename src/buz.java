import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class buz {
   public static bsm<bqt> a(Function<bqt, Optional<btz>> $$0, Predicate<bqt> $$1, int $$2, int $$3, float $$4) {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$5 -> $$5.group($$5.a(bzw.n), $$5.a(bzw.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<btz> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        btz $$11 = $$10.get();
                        if ($$8.dk().a((ix)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           btz $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bzz($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
