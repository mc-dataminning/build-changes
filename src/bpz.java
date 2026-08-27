import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bpz {
   public static bnn<blv> a(int $$0, BiPredicate<blv, blv> $$1) {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$2 -> $$2.group($$2.b(bux.o), $$2.a(bux.aa), $$2.c(bux.ah), $$2.a(bux.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     blv $$10 = $$2.b($$3);
                     if (!$$10.ew()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dm(), (long)$$0);
                        if ($$10.ai() != blj.bv || $$7.Y().b(csu.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
