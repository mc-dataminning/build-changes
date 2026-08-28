import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxi {
   public static buv<btb> a(Function<btb, Optional<bwi>> $$0, Predicate<btb> $$1, int $$2, int $$3, float $$4) {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$5 -> $$5.group($$5.a(ccf.n), $$5.a(ccf.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwi> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwi $$11 = $$10.get();
                        if ($$8.do().a((jt)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwi $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cci($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
