import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bne {
   public static ble<bjm> a(bja<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$2x -> $$2x.group($$2x.a(bsn.n), $$2x.c(bsn.q), $$2x.b(bsn.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bjm> $$9 = $$2x.<bsp>b($$5).a($$3xx -> $$3xx.f((biw)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bjm $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new blo($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
