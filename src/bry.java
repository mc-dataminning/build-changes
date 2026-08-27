import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bry {
   public static bri<cih> a(float $$0, int $$1) {
      return buu.a((Function<buu.b<cih>, ? extends App<buu.c<cih>, bux<cih>>>)($$2 -> $$2.group($$2.c(bys.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dm())) {
                  return false;
               } else {
                  cas $$6 = $$3.y();
                  int $$7 = $$6.a(je.a($$4.dm()));
                  ept $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ept $$10 = cam.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(je.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(je.a(ib.a($$10)));
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
                     $$2x.a(new byv($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
