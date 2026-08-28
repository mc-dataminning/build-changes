import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwb {
   public static bvl<cmm> a(float $$0, int $$1) {
      return byx.a((Function<byx.b<cmm>, ? extends App<byx.c<cmm>, bza<cmm>>>)($$2 -> $$2.group($$2.c(ccv.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dp())) {
                  return false;
               } else {
                  cev $$6 = $$3.y();
                  int $$7 = $$6.a(kb.a($$4.dp()));
                  evt $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     evt $$10 = cep.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kb.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kb.a(iz.a($$10)));
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
                     $$2x.a(new ccy($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
