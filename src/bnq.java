import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnq {
   public static bkt<bjk> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boe.a(
         (Function<boe.b<bjk>, ? extends App<boe.c<bjk>, boh<bjk>>>)($$3 -> $$3.group($$3.c(bsc.o), $$3.c(bsc.m), $$3.a(bsc.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dk()).a(apt.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        gw $$8 = null;
                        gw $$9 = null;
                        gw $$10 = $$6.dk();

                        for (gw $$12 : gw.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dfe $$13 = $$6.dK().a_($$12.c());
                              dfe $$14 = $$6.dK().a_($$12);
                              if ($$14.a(csr.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.di(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bkv($$8));
                           $$4.a(new bsf(new bkv($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
