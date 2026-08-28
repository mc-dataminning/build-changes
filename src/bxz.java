import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxz {
   public static bvy<buf> a(btq<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$2x -> $$2x.group($$2x.a(cdi.n), $$2x.c(cdi.q), $$2x.b(cdi.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<buf> $$9 = $$2x.<cdk>b($$5).a($$3xx -> $$3xx.g((btj)$$7) <= (double)$$2 && $$0.equals($$3xx.ao()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        buf $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bwi($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
