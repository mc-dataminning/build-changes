import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bza {
   public static bzc<bvy> a(float $$0) {
      return cbe.a((Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$1 -> $$1.group($$1.c(cfc.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.du())) {
                  return false;
               } else {
                  Optional<fbx> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cff($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fbx a(ard $$0, bvy $$1) {
      azh $$2 = $$1.dX();
      ji $$3 = $$1.du();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ji $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fbx.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ard $$0, bvy $$1, ji $$2) {
      return $$0.h($$2) && (double)$$0.a(edo.a.e, $$2).v() <= $$1.dB();
   }
}
