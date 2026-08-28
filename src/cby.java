import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cby {
   public static bzm<bxu> a(int $$0, BiPredicate<bxu, bxu> $$1) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$2 -> $$2.group($$2.b(cgw.p), $$2.a(cgw.ac), $$2.c(cgw.aj), $$2.a(cgw.ak))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxu $$10 = $$2.b($$3);
                     if (!$$10.eH()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.an() != bxc.bT || $$7.O().c(djt.P)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
