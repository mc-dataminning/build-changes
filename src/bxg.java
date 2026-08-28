import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bxg {
   public static bxi<buf> a(float $$0) {
      return bzk.a((Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$1 -> $$1.group($$1.c(cdi.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.ds())) {
                  return false;
               } else {
                  Optional<eye> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cdl($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eye a(arg $$0, buf $$1) {
      azk $$2 = $$1.dV();
      je $$3 = $$1.ds();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         je $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eye.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arg $$0, buf $$1, je $$2) {
      return $$0.h($$2) && (double)$$0.a(dzw.a.e, $$2).v() <= $$1.dz();
   }
}
