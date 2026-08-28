import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cbi {
   public static byw<bxe> a(int $$0, BiPredicate<bxe, bxe> $$1) {
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$2 -> $$2.group($$2.b(cgg.p), $$2.a(cgg.ac), $$2.c(cgg.aj), $$2.a(cgg.ak))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxe $$10 = $$2.b($$3);
                     if (!$$10.eH()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.aq() != bwo.bS || $$7.O().c(diw.P)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
