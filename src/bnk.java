import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnk {
   public static bky<bjg> a(Function<bjg, Optional<bmk>> $$0, Predicate<bjg> $$1, int $$2, int $$3, float $$4) {
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$5 -> $$5.group($$5.a(bsh.n), $$5.a(bsh.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bmk> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bmk $$11 = $$10.get();
                        if ($$8.dj().a((ho)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bmk $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bsk($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
