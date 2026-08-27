import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwj {
   public static bui<bso> a(bsa<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$2x -> $$2x.group($$2x.a(cbs.n), $$2x.c(cbs.q), $$2x.b(cbs.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bso> $$9 = $$2x.<cbu>b($$5).a($$3xx -> $$3xx.g((bru)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bso $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bus($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
