import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bqp {
   public static bod<bml> a(int $$0, BiPredicate<bml, bml> $$1) {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$2 -> $$2.group($$2.b(bvn.o), $$2.a(bvn.aa), $$2.c(bvn.ah), $$2.a(bvn.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bml $$10 = $$2.b($$3);
                     if (!$$10.ew()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dm(), (long)$$0);
                        if ($$10.ai() != blz.bv || $$7.Z().b(ctl.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
