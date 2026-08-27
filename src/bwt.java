import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwt {
   public static buh<bso> a(int $$0, BiPredicate<bso, bso> $$1) {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$2 -> $$2.group($$2.b(cbr.o), $$2.a(cbr.ab), $$2.c(cbr.ai), $$2.a(cbr.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bso $$10 = $$2.b($$3);
                     if (!$$10.eJ()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.du(), (long)$$0);
                        if ($$10.ak() != bsb.bE || $$7.ab().b(dbw.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
