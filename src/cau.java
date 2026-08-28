import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cau {
   public static caw<bxu> a(float $$0) {
      return ccy.a((Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$1 -> $$1.group($$1.c(cgw.n)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<ffq> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cgz($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ffq a(ars $$0, bxu $$1) {
      azx $$2 = $$1.dY();
      iv $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iv $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ffq.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ars $$0, bxu $$1, iv $$2) {
      return $$0.h($$2) && (double)$$0.a(ehd.a.e, $$2).v() <= $$1.dC();
   }
}
