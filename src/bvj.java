import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvj {
   public static bsx<bre> a(int $$0, BiPredicate<bre, bre> $$1) {
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$2 -> $$2.group($$2.b(cah.o), $$2.a(cah.ab), $$2.c(cah.ai), $$2.a(cah.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bre $$10 = $$2.b($$3);
                     if (!$$10.ez()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dn(), (long)$$0);
                        if ($$10.ai() != bqr.bx || $$7.aa().b(czq.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
