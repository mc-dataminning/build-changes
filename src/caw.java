import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class caw {
   public static cay<bxw> a(float $$0) {
      return cda.a((Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$1 -> $$1.group($$1.c(cgy.n)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<ffs> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new chb($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ffs a(aru $$0, bxw $$1) {
      azz $$2 = $$1.dY();
      iw $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iw $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ffs.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aru $$0, bxw $$1, iw $$2) {
      return $$0.h($$2) && (double)$$0.a(ehf.a.e, $$2).v() <= $$1.dC();
   }
}
