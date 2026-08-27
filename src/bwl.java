import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwl {
   public static buk<bsq> a(bsc<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$2x -> $$2x.group($$2x.a(cbu.n), $$2x.c(cbu.q), $$2x.b(cbu.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bsq> $$9 = $$2x.<cbw>b($$5).a($$3xx -> $$3xx.g((brw)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bsq $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new buu($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
