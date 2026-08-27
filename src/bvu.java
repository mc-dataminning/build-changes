import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bvu {
   public static btt<bsa> a(brn<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$2x -> $$2x.group($$2x.a(cbd.n), $$2x.c(cbd.q), $$2x.b(cbd.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bsa> $$9 = $$2x.<cbf>b($$5).a($$3xx -> $$3xx.g((brh)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bsa $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bud($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
