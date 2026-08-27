import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class buf {
   public static buh<bre> a(float $$0) {
      return bwj.a((Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$1 -> $$1.group($$1.c(cah.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dn())) {
                  return false;
               } else {
                  Optional<etf> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cak($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static etf a(aqe $$0, bre $$1) {
      ayd $$2 = $$1.ej();
      im $$3 = $$1.dn();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         im $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return etf.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqe $$0, bre $$1, im $$2) {
      return $$0.h($$2) && (double)$$0.a(dvq.a.e, $$2).v() <= $$1.du();
   }
}
