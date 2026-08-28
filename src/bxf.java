import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxf {
   public static bwp<cnt> a(float $$0, int $$1) {
      return cab.a((Function<cab.b<cnt>, ? extends App<cab.c<cnt>, cae<cnt>>>)($$2 -> $$2.group($$2.c(cdz.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dx())) {
                  return false;
               } else {
                  cfz $$6 = $$3.y();
                  int $$7 = $$6.a(ki.a($$4.dx()));
                  ezh $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ezh $$10 = cft.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(ki.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(ki.a(jg.a((jz)$$10)));
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
                     $$2x.a(new cec($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
