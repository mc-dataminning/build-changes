import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzk {
   public static byu<cqk> a(float $$0, int $$1) {
      return ccg.a((Function<ccg.b<cqk>, ? extends App<ccg.c<cqk>, ccj<cqk>>>)($$2 -> $$2.group($$2.c(cge.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  cie $$6 = $$3.A();
                  int $$7 = $$6.a(jx.a($$4.dv()));
                  fei $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fei $$10 = chy.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jx.a($$1xxxx))));
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
                     $$2x.a(new cgh($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
