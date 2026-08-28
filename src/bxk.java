import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxk {
   public static bwu<cny> a(float $$0, int $$1) {
      return cag.a((Function<cag.b<cny>, ? extends App<cag.c<cny>, caj<cny>>>)($$2 -> $$2.group($$2.c(cee.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dx())) {
                  return false;
               } else {
                  cge $$6 = $$3.y();
                  int $$7 = $$6.a(kj.a($$4.dx()));
                  ezn $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ezn $$10 = cfy.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kj.a($$1xxxx))));
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
                     $$2x.a(new ceh($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
