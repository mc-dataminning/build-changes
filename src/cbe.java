import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbe {
   public static byr<bwz> a(Function<bwz, Optional<cae>> $$0, Predicate<bwz> $$1, int $$2, int $$3, float $$4) {
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$5 -> $$5.group($$5.a(cgb.o), $$5.a(cgb.n))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<cae> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        cae $$11 = $$10.get();
                        if ($$8.dt().a((jo)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           cae $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cge($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
