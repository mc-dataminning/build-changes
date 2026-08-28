import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwo {
   public static bvy<cnc> a(float $$0, int $$1) {
      return bzk.a((Function<bzk.b<cnc>, ? extends App<bzk.c<cnc>, bzn<cnc>>>)($$2 -> $$2.group($$2.c(cdi.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.ds())) {
                  return false;
               } else {
                  cfi $$6 = $$3.y();
                  int $$7 = $$6.a(kg.a($$4.ds()));
                  eye $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     eye $$10 = cfc.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kg.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kg.a(je.a((jx)$$10)));
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
                     $$2x.a(new cdl($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
