import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class byh {
   public static byj<bvf> a(float $$0) {
      return cal.a((Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$1 -> $$1.group($$1.c(cej.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dw())) {
                  return false;
               } else {
                  Optional<fay> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cem($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fay a(arc $$0, bvf $$1) {
      azg $$2 = $$1.dZ();
      ji $$3 = $$1.dw();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ji $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fay.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arc $$0, bvf $$1, ji $$2) {
      return $$0.h($$2) && (double)$$0.a(ecq.a.e, $$2).v() <= $$1.dD();
   }
}
