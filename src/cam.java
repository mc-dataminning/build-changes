import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cam {
   public static bxz<bwf> a(Function<bwf, Optional<bzm>> $$0, Predicate<bwf> $$1, int $$2, int $$3, float $$4) {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$5 -> $$5.group($$5.a(cfj.n), $$5.a(cfj.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bzm> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bzm $$11 = $$10.get();
                        if ($$8.du().a((ka)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bzm $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cfm($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
