import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cak {
   public static byj<bwr> a(bwb<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$2x -> $$2x.group($$2x.a(cft.o), $$2x.c(cft.r), $$2x.b(cft.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bwr> $$9 = $$2x.<cfv>b($$5).a($$3xx -> $$3xx.g((bvs)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bwr $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new byt($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
