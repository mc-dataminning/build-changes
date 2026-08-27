import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bpk {
   public static bpm<bmk> a(float $$0) {
      return bro.a((Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$1 -> $$1.group($$1.c(bvm.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dm())) {
                  return false;
               } else {
                  Optional<els> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bvp($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static els a(and $$0, bmk $$1) {
      auu $$2 = $$1.eg();
      hx $$3 = $$1.dm();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         hx $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return els.c($$5);
         }
      }

      return null;
   }

   public static boolean a(and $$0, bmk $$1, hx $$2) {
      return $$0.h($$2) && (double)$$0.a(dop.a.e, $$2).v() <= $$1.dt();
   }
}
