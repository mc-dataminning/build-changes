import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwg {
   public static btt<bsa> a(Function<bsa, Optional<bvg>> $$0, Predicate<bsa> $$1, int $$2, int $$3, float $$4) {
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$5 -> $$5.group($$5.a(cbd.n), $$5.a(cbd.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bvg> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bvg $$11 = $$10.get();
                        if ($$8.dl().a((jg)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bvg $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cbg($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
