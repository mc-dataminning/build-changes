import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class buy {
   public static bsx<bre> a(bqr<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$2x -> $$2x.group($$2x.a(cah.n), $$2x.c(cah.q), $$2x.b(cah.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bre> $$9 = $$2x.<caj>b($$5).a($$3xx -> $$3xx.g((bql)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bre $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bth($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
