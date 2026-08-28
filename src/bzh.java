import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzh {
   public static bwu<bva> a(Function<bva, Optional<byh>> $$0, Predicate<bva> $$1, int $$2, int $$3, float $$4) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$5 -> $$5.group($$5.a(cee.n), $$5.a(cee.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<byh> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        byh $$11 = $$10.get();
                        if ($$8.dv().a((ka)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           byh $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new ceh($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
