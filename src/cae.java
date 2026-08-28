import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cae {
   public static cag<bxe> a(float $$0) {
      return cci.a((Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$1 -> $$1.group($$1.c(cgg.n)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<feq> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cgj($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static feq a(arq $$0, bxe $$1) {
      azv $$2 = $$1.dY();
      iu $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iu $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return feq.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arq $$0, bxe $$1, iu $$2) {
      return $$0.h($$2) && (double)$$0.a(egg.a.e, $$2).v() <= $$1.dC();
   }
}
