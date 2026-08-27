import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bml {
   public static bmn<bjm> a(float $$0) {
      return bop.a((Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$1 -> $$1.group($$1.c(bsn.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.dl())) {
                  return false;
               } else {
                  Optional<ehh> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bsq($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehh a(akt $$0, bjm $$1) {
      ash $$2 = $$1.ef();
      gw $$3 = $$1.dl();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         gw $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ehh.c($$5);
         }
      }

      return null;
   }

   public static boolean a(akt $$0, bjm $$1, gw $$2) {
      return $$0.g($$2) && (double)$$0.a(dkm.a.e, $$2).v() <= $$1.ds();
   }
}
