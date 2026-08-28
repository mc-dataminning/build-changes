import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cav {
   public static byj<bwr> a(int $$0, BiPredicate<bwr, bwr> $$1) {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$2 -> $$2.group($$2.b(cft.p), $$2.a(cft.ac), $$2.c(cft.aj), $$2.a(cft.ak))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwr $$10 = $$2.b($$3);
                     if (!$$10.eG()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.aq() != bwb.bR || $$7.O().c(dhl.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
