import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class btu {
   public static btw<bqt> a(float $$0) {
      return bvy.a((Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$1 -> $$1.group($$1.c(bzw.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dm())) {
                  return false;
               } else {
                  Optional<esj> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bzz($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static esj a(apu $$0, bqt $$1) {
      axt $$2 = $$1.ei();
      id $$3 = $$1.dm();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         id $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return esj.c($$5);
         }
      }

      return null;
   }

   public static boolean a(apu $$0, bqt $$1, id $$2) {
      return $$0.h($$2) && (double)$$0.a(dva.a.e, $$2).v() <= $$1.dt();
   }
}
