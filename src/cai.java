import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cai {
   public static bxv<bwb> a(Function<bwb, Optional<bzi>> $$0, Predicate<bwb> $$1, int $$2, int $$3, float $$4) {
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$5 -> $$5.group($$5.a(cff.n), $$5.a(cff.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bzi> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bzi $$11 = $$10.get();
                        if ($$8.dt().a((ka)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bzi $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cfi($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
