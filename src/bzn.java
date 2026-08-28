import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzn {
   public static bxa<bvg> a(Function<bvg, Optional<byn>> $$0, Predicate<bvg> $$1, int $$2, int $$3, float $$4) {
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$5 -> $$5.group($$5.a(cek.n), $$5.a(cek.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<byn> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        byn $$11 = $$10.get();
                        if ($$8.dt().a((kb)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           byn $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cen($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
