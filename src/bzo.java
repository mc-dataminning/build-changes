import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzo {
   public static bxb<bvh> a(Function<bvh, Optional<byo>> $$0, Predicate<bvh> $$1, int $$2, int $$3, float $$4) {
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$5 -> $$5.group($$5.a(cel.n), $$5.a(cel.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<byo> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        byo $$11 = $$10.get();
                        if ($$8.dt().a((ka)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           byo $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ceo($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
