import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bql {
   public static bnn<bme> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bqz.a(
         (Function<bqz.b<bme>, ? extends App<bqz.c<bme>, brc<bme>>>)($$3 -> $$3.group($$3.c(bux.o), $$3.c(bux.m), $$3.a(bux.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dm()).a(arw.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        hv $$8 = null;
                        hv $$9 = null;
                        hv $$10 = $$6.dm();

                        for (hv $$12 : hv.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dip $$13 = $$6.dM().a_($$12.c());
                              dip $$14 = $$6.dM().a_($$12);
                              if ($$14.a(cwb.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dk(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bnp($$8));
                           $$4.a(new bva(new bnp($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
