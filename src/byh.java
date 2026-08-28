import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byh {
   public static bxr<cpa> a(float $$0, int $$1) {
      return cbd.a((Function<cbd.b<cpa>, ? extends App<cbd.c<cpa>, cbg<cpa>>>)($$2 -> $$2.group($$2.c(cfb.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dw())) {
                  return false;
               } else {
                  chb $$6 = $$3.A();
                  int $$7 = $$6.a(kj.a($$4.dw()));
                  fbr $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fbr $$10 = cgv.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kj.a($$1xxxx))));
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
                     $$2x.a(new cfe($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
