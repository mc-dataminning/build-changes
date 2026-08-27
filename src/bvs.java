import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvs {
   public static bvu<bsq> a(float $$0) {
      return bxw.a((Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$1 -> $$1.group($$1.c(cbu.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dp())) {
                  return false;
               } else {
                  Optional<eum> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cbx($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eum a(aqn $$0, bsq $$1) {
      aym $$2 = $$1.el();
      io $$3 = $$1.dp();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         io $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eum.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqn $$0, bsq $$1, io $$2) {
      return $$0.h($$2) && (double)$$0.a(dwv.a.e, $$2).v() <= $$1.dw();
   }
}
