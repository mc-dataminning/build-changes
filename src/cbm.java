import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbm {
   private static final int a = 10;
   private static final int b = 7;

   public static bzt<bwz> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bzt<bwz> a(float $$0, int $$1, int $$2) {
      return cbv.a((Function<cbv.b<bwz>, ? extends App<cbv.c<bwz>, cby<bwz>>>)($$3 -> $$3.group($$3.c(cft.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               jj $$7 = $$5.dv();
               fcu $$8;
               if ($$4.c($$7)) {
                  $$8 = chn.a($$5, $$1, $$2);
               } else {
                  kl $$9 = kl.a($$7);
                  kl $$10 = byk.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = chk.a($$5, $$1, $$2, fcu.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = chn.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cfw($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
