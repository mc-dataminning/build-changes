import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bpl {
   public static bpn<bml> a(float $$0) {
      return brp.a((Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$1 -> $$1.group($$1.c(bvn.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dm())) {
                  return false;
               } else {
                  Optional<elt> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bvq($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static elt a(and $$0, bml $$1) {
      auv $$2 = $$1.eg();
      hx $$3 = $$1.dm();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         hx $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return elt.c($$5);
         }
      }

      return null;
   }

   public static boolean a(and $$0, bml $$1, hx $$2) {
      return $$0.h($$2) && (double)$$0.a(doq.a.e, $$2).v() <= $$1.dt();
   }
}
