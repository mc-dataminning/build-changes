import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class buu {
   public static bsh<bqo> a(Function<bqo, Optional<btu>> $$0, Predicate<bqo> $$1, int $$2, int $$3, float $$4) {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$5 -> $$5.group($$5.a(bzr.n), $$5.a(bzr.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<btu> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        btu $$11 = $$10.get();
                        if ($$8.dk().a((iv)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           btu $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bzu($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
