import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class btg {
   public static bri<bpp> a(bps $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bss<bpp> a(bpd<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bss<bpp> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bss<bpp> a(Predicate<bpp> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$2x -> $$2x.group($$2x.c(bys.n), $$2x.b(bys.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bpp> $$8 = $$2x.<byu>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((box)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new brs($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
