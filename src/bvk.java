import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvk {
   public static bsx<bre> a(Function<bre, Optional<buk>> $$0, Predicate<bre> $$1, int $$2, int $$3, float $$4) {
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$5 -> $$5.group($$5.a(cah.n), $$5.a(cah.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<buk> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        buk $$11 = $$10.get();
                        if ($$8.dl().a((jf)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           buk $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cak($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
