import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class can {
   public static bya<bwg> a(Function<bwg, Optional<bzn>> $$0, Predicate<bwg> $$1, int $$2, int $$3, float $$4) {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$5 -> $$5.group($$5.a(cfk.n), $$5.a(cfk.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bzn> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bzn $$11 = $$10.get();
                        if ($$8.du().a((ka)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bzn $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cfn($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
