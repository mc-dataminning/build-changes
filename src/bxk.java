import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxk {
   public static bvj<btp> a(bta<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$2x -> $$2x.group($$2x.a(cct.n), $$2x.c(cct.q), $$2x.b(cct.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btp> $$9 = $$2x.<ccv>b($$5).a($$3xx -> $$3xx.g((bsu)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btp $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvt($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
