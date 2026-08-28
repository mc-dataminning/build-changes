import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxt {
   public static bvg<btl> a(Function<btl, Optional<bwt>> $$0, Predicate<btl> $$1, int $$2, int $$3, float $$4) {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$5 -> $$5.group($$5.a(ccq.n), $$5.a(ccq.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bwt> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bwt $$11 = $$10.get();
                        if ($$8.do().a((jw)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bwt $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cct($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
