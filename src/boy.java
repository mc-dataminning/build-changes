import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class boy {
   public static bmy<blg> a(bku<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$2x -> $$2x.group($$2x.a(buh.n), $$2x.c(buh.q), $$2x.b(buh.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<blg> $$9 = $$2x.<buj>b($$5).a($$3xx -> $$3xx.f((bkq)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        blg $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bni($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
