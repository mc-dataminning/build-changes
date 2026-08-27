import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpc {
   public static bmq<bky> a(Function<bky, Optional<boc>> $$0, Predicate<bky> $$1, int $$2, int $$3, float $$4) {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$5 -> $$5.group($$5.a(btz.n), $$5.a(btz.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<boc> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        boc $$11 = $$10.get();
                        if ($$8.dj().a((im)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           boc $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new buc($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
