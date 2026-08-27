import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class btj {
   public static bri<bpp> a(bpd<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$2x -> $$2x.group($$2x.a(bys.n), $$2x.c(bys.q), $$2x.b(bys.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bpp> $$9 = $$2x.<byu>b($$5).a($$3xx -> $$3xx.g((box)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bpp $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new brs($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
