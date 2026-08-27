import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bpf {
   public static bph<bmf> a(float $$0) {
      return brj.a((Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$1 -> $$1.group($$1.c(bvh.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dm())) {
                  return false;
               } else {
                  Optional<elm> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bvk($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static elm a(amz $$0, bmf $$1) {
      aup $$2 = $$1.eg();
      hx $$3 = $$1.dm();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         hx $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return elm.c($$5);
         }
      }

      return null;
   }

   public static boolean a(amz $$0, bmf $$1, hx $$2) {
      return $$0.h($$2) && (double)$$0.a(doj.a.e, $$2).v() <= $$1.dt();
   }
}
