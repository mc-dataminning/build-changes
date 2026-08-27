import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bow {
   public static bog<cfd> a(float $$0, int $$1) {
      return brs.a((Function<brs.b<cfd>, ? extends App<brs.c<cfd>, brv<cfd>>>)($$2 -> $$2.group($$2.c(bvq.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dl())) {
                  return false;
               } else {
                  bxq $$6 = $$3.y();
                  int $$7 = $$6.a(iz.a($$4.dl()));
                  emc $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     emc $$10 = bxk.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(iz.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(iz.a(hx.a($$10)));
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
                     $$2x.a(new bvt($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
