import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bww {
   public static bwg<cnk> a(float $$0, int $$1) {
      return bzs.a((Function<bzs.b<cnk>, ? extends App<bzs.c<cnk>, bzv<cnk>>>)($$2 -> $$2.group($$2.c(cdq.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.ds())) {
                  return false;
               } else {
                  cfq $$6 = $$3.y();
                  int $$7 = $$6.a(kh.a($$4.ds()));
                  eyw $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     eyw $$10 = cfk.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kh.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kh.a(jf.a((jy)$$10)));
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
                     $$2x.a(new cdt($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
