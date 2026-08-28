import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class can {
   public static bzx<cru> a(float $$0, int $$1) {
      return cdj.a((Function<cdj.b<cru>, ? extends App<cdj.c<cru>, cdm<cru>>>)($$2 -> $$2.group($$2.c(chh.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  cjh $$6 = $$3.A();
                  int $$7 = $$6.a(jz.a($$4.dv()));
                  fgc $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fgc $$10 = cjb.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jz.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jz.a(iw.a((jq)$$10)));
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
                     $$2x.a(new chk($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
