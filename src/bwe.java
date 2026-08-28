import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bwe {
   public static bwg<btc> a(float $$0) {
      return byi.a((Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$1 -> $$1.group($$1.c(ccg.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dr())) {
                  return false;
               } else {
                  Optional<ewh> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new ccj($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ewh a(aqm $$0, btc $$1) {
      ayo $$2 = $$1.dU();
      ja $$3 = $$1.dr();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ja $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ewh.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqm $$0, btc $$1, ja $$2) {
      return $$0.h($$2) && (double)$$0.a(dyg.a.e, $$2).v() <= $$1.dy();
   }
}
