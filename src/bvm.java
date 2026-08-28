import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvm {
   public static buw<cly> a(float $$0, int $$1) {
      return byi.a((Function<byi.b<cly>, ? extends App<byi.c<cly>, byl<cly>>>)($$2 -> $$2.group($$2.c(ccg.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dr())) {
                  return false;
               } else {
                  ceg $$6 = $$3.y();
                  int $$7 = $$6.a(kc.a($$4.dr()));
                  ewh $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ewh $$10 = cea.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kc.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kc.a(ja.a($$10)));
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
                     $$2x.a(new ccj($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
