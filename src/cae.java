import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cae {
   public static bxs<bvy> a(int $$0, BiPredicate<bvy, bvy> $$1) {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$2 -> $$2.group($$2.b(cfc.o), $$2.a(cfc.ab), $$2.c(cfc.ai), $$2.a(cfc.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvy $$10 = $$2.b($$3);
                     if (!$$10.eF()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.du(), (long)$$0);
                        if ($$10.aq() != bvi.bR || $$7.O().b(dgv.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
