import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqp {
   public static boc<bmk> a(Function<bmk, Optional<bpp>> $$0, Predicate<bmk> $$1, int $$2, int $$3, float $$4) {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$5 -> $$5.group($$5.a(bvm.n), $$5.a(bvm.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bpp> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bpp $$11 = $$10.get();
                        if ($$8.dk().a((ir)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bpp $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bvp($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
