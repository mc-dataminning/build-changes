import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzs {
   public static bxr<bvx> a(bvi<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$2x -> $$2x.group($$2x.a(cfb.n), $$2x.c(cfb.q), $$2x.b(cfb.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvx> $$9 = $$2x.<cfd>b($$5).a($$3xx -> $$3xx.g((bvb)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bvx $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new byb($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
