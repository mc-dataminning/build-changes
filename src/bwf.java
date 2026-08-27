import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwf {
   public static btt<bsa> a(int $$0, BiPredicate<bsa, bsa> $$1) {
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$2 -> $$2.group($$2.b(cbd.o), $$2.a(cbd.ab), $$2.c(cbd.ai), $$2.a(cbd.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bsa $$10 = $$2.b($$3);
                     if (!$$10.ez()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dn(), (long)$$0);
                        if ($$10.ai() != brn.bx || $$7.aa().b(czz.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
