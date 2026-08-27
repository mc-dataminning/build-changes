import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsk {
   public static bpx<bog> a(Function<bog, Optional<brk>> $$0, Predicate<bog> $$1, int $$2, int $$3, float $$4) {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$5 -> $$5.group($$5.a(bxh.n), $$5.a(bxh.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<brk> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        brk $$11 = $$10.get();
                        if ($$8.dk().a((it)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           brk $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bxk($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
