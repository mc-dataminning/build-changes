import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbh {
   public static byu<bxc> a(Function<bxc, Optional<cah>> $$0, Predicate<bxc> $$1, int $$2, int $$3, float $$4) {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$5 -> $$5.group($$5.a(cge.o), $$5.a(cge.n))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<cah> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        cah $$11 = $$10.get();
                        if ($$8.dt().a((jo)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           cah $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cgh($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
