import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byl {
   public static bxv<cpe> a(float $$0, int $$1) {
      return cbh.a((Function<cbh.b<cpe>, ? extends App<cbh.c<cpe>, cbk<cpe>>>)($$2 -> $$2.group($$2.c(cff.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  chf $$6 = $$3.z();
                  int $$7 = $$6.a(kj.a($$4.dv()));
                  fbs $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fbs $$10 = cgz.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kj.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kj.a(jh.a((ka)$$10)));
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
                     $$2x.a(new cfi($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
