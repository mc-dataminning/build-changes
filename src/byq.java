import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byq {
   public static bwd<buk> a(Function<buk, Optional<bxq>> $$0, Predicate<buk> $$1, int $$2, int $$3, float $$4) {
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$5 -> $$5.group($$5.a(cdn.n), $$5.a(cdn.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bxq> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bxq $$11 = $$10.get();
                        if ($$8.dq().a((jx)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bxq $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cdq($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
