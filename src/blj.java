import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blj {
   public static bkt<cbc> a(float $$0, int $$1) {
      return boe.a((Function<boe.b<cbc>, ? extends App<boe.c<cbc>, boh<cbc>>>)($$2 -> $$2.group($$2.c(bsc.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.b($$4.dk())) {
                  return false;
               } else {
                  bua $$6 = $$3.w();
                  int $$7 = $$6.a(hz.a($$4.dk()));
                  ehi $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ehi $$10 = btu.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(hz.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(hz.a(gw.a($$10)));
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
                     $$2x.a(new bsf($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
