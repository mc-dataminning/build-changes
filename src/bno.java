import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bno {
   private static final int a = 60;

   public static bkt<bjk> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boe.a(
         (Function<boe.b<bjk>, ? extends App<boe.c<bjk>, boh<bjk>>>)($$3 -> $$3.group($$3.c(bsc.o), $$3.c(bsc.m), $$3.a(bsc.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dk()).a(apt.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        gw $$8 = $$6.dk();
                        gw.a $$9 = new gw.a();
                        ehn $$10 = ehn.a($$6);

                        for (gw $$11 : gw.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dfe $$12 = $$5x.a_($$11);
                              dfe $$13 = $$5x.a_($$9.a($$11, hc.a));
                              if (!$$12.a(csr.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, hc.b)) {
                                 gw $$14 = $$11.i();
                                 $$5.a(new bkv($$14));
                                 $$4.a(new bsf(new bkv($$14), $$1, 1));
                                 break;
                              }
                           }
                        }

                        $$2.setValue($$7 + 60L);
                        return true;
                     }
                  }))
      );
   }
}
