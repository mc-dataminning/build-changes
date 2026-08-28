import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bwr {
   public static bwt<btp> a(float $$0) {
      return byv.a((Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$1 -> $$1.group($$1.c(cct.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dp())) {
                  return false;
               } else {
                  Optional<evr> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new ccw($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static evr a(arf $$0, btp $$1) {
      azh $$2 = $$1.el();
      iz $$3 = $$1.dp();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iz $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return evr.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arf $$0, btp $$1, iz $$2) {
      return $$0.h($$2) && (double)$$0.a(dxu.a.e, $$2).v() <= $$1.dw();
   }
}
