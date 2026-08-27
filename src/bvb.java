import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvb {
   public static bvd<bsa> a(float $$0) {
      return bxf.a((Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$1 -> $$1.group($$1.c(cbd.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dn())) {
                  return false;
               } else {
                  Optional<etp> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cbg($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static etp a(aqh $$0, bsa $$1) {
      ayg $$2 = $$1.ej();
      in $$3 = $$1.dn();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         in $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return etp.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqh $$0, bsa $$1, in $$2) {
      return $$0.h($$2) && (double)$$0.a(dvz.a.e, $$2).v() <= $$1.du();
   }
}
