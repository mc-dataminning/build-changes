import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byz {
   public static byj<cpu> a(float $$0, int $$1) {
      return cbv.a((Function<cbv.b<cpu>, ? extends App<cbv.c<cpu>, cby<cpu>>>)($$2 -> $$2.group($$2.c(cft.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  cht $$6 = $$3.A();
                  int $$7 = $$6.a(kl.a($$4.dv()));
                  fcu $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fcu $$10 = chn.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kl.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kl.a(jj.a((kc)$$10)));
                        if ($$11 < $$7) {
                           $$8 = $$10;
                           break;
                        }

                        if ($$11 == $$7) {
                           $$8 = $$10;
                        }
                     }
                  }

                  if ($$8 != null) {
                     $$2x.a(new cfw($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
