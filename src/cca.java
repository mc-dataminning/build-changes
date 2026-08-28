import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cca {
   public static bzo<bxw> a(int $$0, BiPredicate<bxw, bxw> $$1) {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$2 -> $$2.group($$2.b(cgy.p), $$2.a(cgy.ac), $$2.c(cgy.aj), $$2.a(cgy.ak))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxw $$10 = $$2.b($$3);
                     if (!$$10.eH()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.an() != bxe.bT || $$7.O().c(djv.P)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
