import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqr {
   public static bqb<cgy> a(float $$0, int $$1) {
      return btn.a((Function<btn.b<cgy>, ? extends App<btn.c<cgy>, btq<cgy>>>)($$2 -> $$2.group($$2.c(bxl.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dm())) {
                  return false;
               } else {
                  bzl $$6 = $$3.y();
                  int $$7 = $$6.a(jb.a($$4.dm()));
                  enz $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     enz $$10 = bzf.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jb.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jb.a(hz.a($$10)));
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
                     $$2x.a(new bxo($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
