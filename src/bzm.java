import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzm {
   public static byw<cqo> a(float $$0, int $$1) {
      return cci.a((Function<cci.b<cqo>, ? extends App<cci.c<cqo>, ccl<cqo>>>)($$2 -> $$2.group($$2.c(cgg.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  cig $$6 = $$3.A();
                  int $$7 = $$6.a(jx.a($$4.dv()));
                  feq $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     feq $$10 = cia.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jx.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jx.a(iu.a((jo)$$10)));
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
                     $$2x.a(new cgj($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
