import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnp {
   public static bkt<bjk> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boe.a(
         (Function<boe.b<bjk>, ? extends App<boe.c<bjk>, boh<bjk>>>)($$3 -> $$3.group($$3.c(bsc.o), $$3.c(bsc.m), $$3.a(bsc.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dk()).a(apt.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ehn $$8 = ehn.a($$6);
                           gw $$9 = $$6.dk();
                           gw.a $$10 = new gw.a();

                           label45:
                           for (gw $$11 : gw.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, hc.a)).b($$5x, $$11, $$8).c()) {
                                 for (hc $$12 : hc.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(hc.a)).a(csr.G)) {
                                       $$5.a(new bkv($$11));
                                       $$4.a(new bsf(new bkv($$11), $$1, 0));
                                       break label45;
                                    }
                                 }
                              }
                           }

                           $$2.setValue($$7 + 40L);
                           return true;
                        }
                     }
               ))
      );
   }
}
