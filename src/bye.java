import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bye {
   public static bwd<buk> a(btv<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$2x -> $$2x.group($$2x.a(cdn.n), $$2x.c(cdn.q), $$2x.b(cdn.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<buk> $$9 = $$2x.<cdp>b($$5).a($$3xx -> $$3xx.g((bto)$$7) <= (double)$$2 && $$0.equals($$3xx.ao()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        buk $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bwn($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
