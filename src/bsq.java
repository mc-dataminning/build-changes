import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bsq {
   public static bss<bpp> a(float $$0) {
      return buu.a((Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$1 -> $$1.group($$1.c(bys.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dm())) {
                  return false;
               } else {
                  Optional<ept> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new byv($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ept a(apf $$0, bpp $$1) {
      axd $$2 = $$1.ei();
      ib $$3 = $$1.dm();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ib $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ept.c($$5);
         }
      }

      return null;
   }

   public static boolean a(apf $$0, bpp $$1, ib $$2) {
      return $$0.h($$2) && (double)$$0.a(dso.a.e, $$2).v() <= $$1.dt();
   }
}
