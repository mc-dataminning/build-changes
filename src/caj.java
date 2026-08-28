import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class caj {
   public static cal<bxj> a(float $$0) {
      return ccn.a((Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$1 -> $$1.group($$1.c(cgl.n)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.du())) {
                  return false;
               } else {
                  Optional<ffc> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cgo($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ffc a(arq $$0, bxj $$1) {
      azv $$2 = $$1.dX();
      iv $$3 = $$1.du();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iv $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ffc.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arq $$0, bxj $$1, iv $$2) {
      return $$0.h($$2) && (double)$$0.a(egs.a.e, $$2).v() <= $$1.dB();
   }
}
