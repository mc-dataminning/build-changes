import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvq {
   public static bvs<bso> a(float $$0) {
      return bxu.a((Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$1 -> $$1.group($$1.c(cbs.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dp())) {
                  return false;
               } else {
                  Optional<euk> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cbv($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static euk a(aqm $$0, bso $$1) {
      ayk $$2 = $$1.el();
      io $$3 = $$1.dp();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         io $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return euk.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqm $$0, bso $$1, io $$2) {
      return $$0.h($$2) && (double)$$0.a(dwt.a.e, $$2).v() <= $$1.dw();
   }
}
