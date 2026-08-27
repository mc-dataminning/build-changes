import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bpo {
   public static bpq<bmo> a(float $$0) {
      return brs.a((Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$1 -> $$1.group($$1.c(bvq.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dl())) {
                  return false;
               } else {
                  Optional<emc> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bvt($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static emc a(ane $$0, bmo $$1) {
      auw $$2 = $$1.eg();
      hx $$3 = $$1.dl();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         hx $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return emc.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ane $$0, bmo $$1, hx $$2) {
      return $$0.h($$2) && (double)$$0.a(doy.a.e, $$2).v() <= $$1.ds();
   }
}
