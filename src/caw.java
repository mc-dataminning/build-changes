import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class caw {
   public static byj<bwr> a(Function<bwr, Optional<bzw>> $$0, Predicate<bwr> $$1, int $$2, int $$3, float $$4) {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$5 -> $$5.group($$5.a(cft.o), $$5.a(cft.n))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bzw> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bzw $$11 = $$10.get();
                        if ($$8.dt().a((kc)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bzw $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cfw($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
