import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzp {
   public static bxc<bvi> a(Function<bvi, Optional<byp>> $$0, Predicate<bvi> $$1, int $$2, int $$3, float $$4) {
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$5 -> $$5.group($$5.a(cem.n), $$5.a(cem.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<byp> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        byp $$11 = $$10.get();
                        if ($$8.dt().a((kb)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           byp $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cep($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
