import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cae {
   public static bxr<bvx> a(Function<bvx, Optional<bze>> $$0, Predicate<bvx> $$1, int $$2, int $$3, float $$4) {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$5 -> $$5.group($$5.a(cfb.n), $$5.a(cfb.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bze> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bze $$11 = $$10.get();
                        if ($$8.du().a((ka)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bze $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cfe($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
