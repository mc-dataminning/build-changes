import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bwa {
   public static bwc<bsy> a(float $$0) {
      return bye.a((Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$1 -> $$1.group($$1.c(ccc.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dp())) {
                  return false;
               } else {
                  Optional<evz> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new ccf($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static evz a(aqk $$0, bsy $$1) {
      aym $$2 = $$1.dS();
      ja $$3 = $$1.dp();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ja $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return evz.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqk $$0, bsy $$1, ja $$2) {
      return $$0.h($$2) && (double)$$0.a(dxz.a.e, $$2).v() <= $$1.dw();
   }
}
