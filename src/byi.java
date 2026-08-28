import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byi {
   public static bxs<cpd> a(float $$0, int $$1) {
      return cbe.a((Function<cbe.b<cpd>, ? extends App<cbe.c<cpd>, cbh<cpd>>>)($$2 -> $$2.group($$2.c(cfc.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.du())) {
                  return false;
               } else {
                  chc $$6 = $$3.A();
                  int $$7 = $$6.a(kk.a($$4.du()));
                  fbx $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fbx $$10 = cgw.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kk.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kk.a(ji.a((kb)$$10)));
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
                     $$2x.a(new cff($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
