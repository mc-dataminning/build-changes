import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bui {
   public static bsh<bqo> a(bqb<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$2x -> $$2x.group($$2x.a(bzr.n), $$2x.c(bzr.q), $$2x.b(bzr.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bqo> $$9 = $$2x.<bzt>b($$5).a($$3xx -> $$3xx.g((bpv)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bqo $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bsr($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
