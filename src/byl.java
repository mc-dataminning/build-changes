import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byl {
   public static bvy<buf> a(Function<buf, Optional<bxl>> $$0, Predicate<buf> $$1, int $$2, int $$3, float $$4) {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$5 -> $$5.group($$5.a(cdi.n), $$5.a(cdi.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bxl> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bxl $$11 = $$10.get();
                        if ($$8.dq().a((jx)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bxl $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cdl($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
