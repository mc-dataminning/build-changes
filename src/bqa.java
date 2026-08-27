import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqa {
   public static bnn<blv> a(Function<blv, Optional<bpa>> $$0, Predicate<blv> $$1, int $$2, int $$3, float $$4) {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$5 -> $$5.group($$5.a(bux.n), $$5.a(bux.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bpa> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bpa $$11 = $$10.get();
                        if ($$8.dk().a((ip)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bpa $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bva($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
