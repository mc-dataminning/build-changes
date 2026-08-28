import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxr {
   public static bxb<cof> a(float $$0, int $$1) {
      return can.a((Function<can.b<cof>, ? extends App<can.c<cof>, caq<cof>>>)($$2 -> $$2.group($$2.c(cel.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  cgl $$6 = $$3.z();
                  int $$7 = $$6.a(kj.a($$4.dv()));
                  ezy $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ezy $$10 = cgf.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kj.a($$1xxxx))));
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
                     $$2x.a(new ceo($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
