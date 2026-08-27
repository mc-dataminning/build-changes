import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blf {
   public static bkp<cay> a(float $$0, int $$1) {
      return boa.a((Function<boa.b<cay>, ? extends App<boa.c<cay>, bod<cay>>>)($$2 -> $$2.group($$2.c(bry.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.b($$4.dk())) {
                  return false;
               } else {
                  btw $$6 = $$3.w();
                  int $$7 = $$6.a(hy.a($$4.dk()));
                  ehf $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ehf $$10 = btq.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(hy.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(hy.a(gv.a($$10)));
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
                     $$2x.a(new bsb($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
