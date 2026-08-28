import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccr {
   private static final int a = 10;
   private static final int b = 7;

   public static cay<bye> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static cay<bye> a(float $$0, int $$1, int $$2) {
      return cda.a((Function<cda.b<bye>, ? extends App<cda.c<bye>, cdd<bye>>>)($$3 -> $$3.group($$3.c(cgy.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               iw $$7 = $$5.dv();
               ffs $$8;
               if ($$4.c($$7)) {
                  $$8 = cis.a($$5, $$1, $$2);
               } else {
                  jz $$9 = jz.a($$7);
                  jz $$10 = bzp.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cip.a($$5, $$1, $$2, ffs.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cis.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new chb($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
