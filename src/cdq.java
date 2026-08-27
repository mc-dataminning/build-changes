import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdq {
   public static bnn<blv> a(int $$0, int $$1) {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$2 -> $$2.group($$2.b(bux.ac), $$2.b(bux.K), $$2.a(bux.ad), $$2.a(bux.ae))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.eU().b()) {
                        return false;
                     } else {
                        Optional<Integer> $$9 = $$2.a($$5);
                        if ($$9.isEmpty()) {
                           $$5.a(0);
                        } else {
                           int $$10 = $$9.get();
                           if ($$10 > $$0) {
                              $$3.b();
                              $$5.b();
                              $$6.a(true, (long)$$1);
                           } else {
                              $$5.a($$10 + 1);
                           }
                        }

                        return true;
                     }
                  }))
      );
   }
}
