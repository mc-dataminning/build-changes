import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnf {
   public static bkt<bjb> a(Function<bjb, Optional<bmf>> $$0, Predicate<bjb> $$1, int $$2, int $$3, float $$4) {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$5 -> $$5.group($$5.a(bsc.n), $$5.a(bsc.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bmf> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bmf $$11 = $$10.get();
                        if ($$8.di().a((hq)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bmf $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bsf($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
