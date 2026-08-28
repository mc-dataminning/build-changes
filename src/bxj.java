import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxj {
   public static bvi<btn> a(bsx<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return byu.a(
         (Function<byu.b<btn>, ? extends App<byu.c<btn>, byx<btn>>>)($$2x -> $$2x.group($$2x.a(ccs.n), $$2x.c(ccs.q), $$2x.b(ccs.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btn> $$9 = $$2x.<ccu>b($$5).a($$3xx -> $$3xx.g((bsr)$$7) <= (double)$$2 && $$0.equals($$3xx.am()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btn $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvs($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
