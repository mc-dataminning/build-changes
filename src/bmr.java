import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmr {
   public static bkr<biy> a(bim<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$2x -> $$2x.group($$2x.a(bsa.n), $$2x.c(bsa.q), $$2x.b(bsa.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<biy> $$9 = $$2x.<bsc>b($$5).a($$3xx -> $$3xx.f((bii)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        biy $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new blb($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
