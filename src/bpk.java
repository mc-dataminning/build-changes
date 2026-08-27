import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpk {
   public static bmy<blg> a(Function<blg, Optional<bok>> $$0, Predicate<blg> $$1, int $$2, int $$3, float $$4) {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$5 -> $$5.group($$5.a(buh.n), $$5.a(buh.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bok> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bok $$11 = $$10.get();
                        if ($$8.dl().a((im)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bok $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new buk($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
