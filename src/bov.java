import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bov {
   public static box<blv> a(float $$0) {
      return bqz.a((Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$1 -> $$1.group($$1.c(bux.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.dm())) {
                  return false;
               } else {
                  Optional<elb> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bva($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static elb a(amp $$0, blv $$1) {
      auf $$2 = $$1.eg();
      hv $$3 = $$1.dm();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         hv $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return elb.c($$5);
         }
      }

      return null;
   }

   public static boolean a(amp $$0, blv $$1, hv $$2) {
      return $$0.g($$2) && (double)$$0.a(dny.a.e, $$2).v() <= $$1.dt();
   }
}
