import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class byi {
   public static byk<bvg> a(float $$0) {
      return cam.a((Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$1 -> $$1.group($$1.c(cek.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dw())) {
                  return false;
               } else {
                  Optional<fba> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cen($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fba a(arc $$0, bvg $$1) {
      azh $$2 = $$1.dZ();
      ji $$3 = $$1.dw();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ji $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fba.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arc $$0, bvg $$1, ji $$2) {
      return $$0.h($$2) && (double)$$0.a(ecs.a.e, $$2).v() <= $$1.dD();
   }
}
