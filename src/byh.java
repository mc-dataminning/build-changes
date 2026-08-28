import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byh {
   public static bwg<bun> a(bty<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$2x -> $$2x.group($$2x.a(cdq.n), $$2x.c(cdq.q), $$2x.b(cdq.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bun> $$9 = $$2x.<cds>b($$5).a($$3xx -> $$3xx.g((btr)$$7) <= (double)$$2 && $$0.equals($$3xx.ao()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bun $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bwq($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
