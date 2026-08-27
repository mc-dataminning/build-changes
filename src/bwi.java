import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwi {
   public static buh<bso> a(bsb<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$2x -> $$2x.group($$2x.a(cbr.n), $$2x.c(cbr.q), $$2x.b(cbr.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bso> $$9 = $$2x.<cbt>b($$5).a($$3xx -> $$3xx.g((brv)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bso $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bur($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
