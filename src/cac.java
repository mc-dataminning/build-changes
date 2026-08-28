import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cac {
   public static bzm<crj> a(float $$0, int $$1) {
      return ccy.a((Function<ccy.b<crj>, ? extends App<ccy.c<crj>, cdb<crj>>>)($$2 -> $$2.group($$2.c(cgw.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  ciw $$6 = $$3.A();
                  int $$7 = $$6.a(jy.a($$4.dv()));
                  ffq $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ffq $$10 = ciq.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jy.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jy.a(iv.a((jp)$$10)));
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
                     $$2x.a(new cgz($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
