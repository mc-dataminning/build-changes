import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqh {
   public static bog<bmo> a(bmc<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$2x -> $$2x.group($$2x.a(bvq.n), $$2x.c(bvq.q), $$2x.b(bvq.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bmo> $$9 = $$2x.<bvs>b($$5).a($$3xx -> $$3xx.f((blw)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bmo $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new boq($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
