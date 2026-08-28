import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cbf {
   public static cbh<byf> a(float $$0) {
      return cdj.a((Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$1 -> $$1.group($$1.c(chh.n)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<fgc> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new chk($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fgc a(asb $$0, byf $$1) {
      bai $$2 = $$1.dY();
      iw $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iw $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fgc.c($$5);
         }
      }

      return null;
   }

   public static boolean a(asb $$0, byf $$1, iw $$2) {
      return $$0.h($$2) && (double)$$0.a(ehp.a.e, $$2).v() <= $$1.dC();
   }
}
