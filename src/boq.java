import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class boq {
   public static bmq<bky> a(bkm<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$2x -> $$2x.group($$2x.a(btz.n), $$2x.c(btz.q), $$2x.b(btz.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bky> $$9 = $$2x.<bub>b($$5).a($$3xx -> $$3xx.f((bki)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bky $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bna($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
