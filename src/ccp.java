import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccp {
   private static final int a = 10;
   private static final int b = 7;

   public static caw<byc> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static caw<byc> a(float $$0, int $$1, int $$2) {
      return ccy.a((Function<ccy.b<byc>, ? extends App<ccy.c<byc>, cdb<byc>>>)($$3 -> $$3.group($$3.c(cgw.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               iv $$7 = $$5.dv();
               ffq $$8;
               if ($$4.c($$7)) {
                  $$8 = ciq.a($$5, $$1, $$2);
               } else {
                  jy $$9 = jy.a($$7);
                  jy $$10 = bzn.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cin.a($$5, $$1, $$2, ffq.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = ciq.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cgz($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
