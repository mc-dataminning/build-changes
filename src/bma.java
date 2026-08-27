import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bma {
   public static bmc<bjb> a(float $$0) {
      return boe.a((Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$1 -> $$1.group($$1.c(bsc.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.dk())) {
                  return false;
               } else {
                  Optional<ehi> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bsf($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehi a(akn $$0, bjb $$1) {
      arx $$2 = $$1.ee();
      gw $$3 = $$1.dk();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         gw $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ehi.c($$5);
         }
      }

      return null;
   }

   public static boolean a(akn $$0, bjb $$1, gw $$2) {
      return $$0.g($$2) && (double)$$0.a(dkn.a.e, $$2).v() <= $$1.dr();
   }
}
