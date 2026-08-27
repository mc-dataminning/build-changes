import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bun {
   public static bsm<bqt> a(bqg<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$2x -> $$2x.group($$2x.a(bzw.n), $$2x.c(bzw.q), $$2x.b(bzw.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bqt> $$9 = $$2x.<bzy>b($$5).a($$3xx -> $$3xx.g((bqa)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bqt $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bsw($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
