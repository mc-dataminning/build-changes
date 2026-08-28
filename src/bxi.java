import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxi {
   public static bvh<btn> a(bsy<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return byt.a(
         (Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$2x -> $$2x.group($$2x.a(ccr.n), $$2x.c(ccr.q), $$2x.b(ccr.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btn> $$9 = $$2x.<cct>b($$5).a($$3xx -> $$3xx.g((bss)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btn $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvr($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
