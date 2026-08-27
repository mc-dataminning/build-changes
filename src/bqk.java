import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bqk {
   public static bnn<bme> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bqz.a(
         (Function<bqz.b<bme>, ? extends App<bqz.c<bme>, brc<bme>>>)($$3 -> $$3.group($$3.c(bux.o), $$3.c(bux.m), $$3.a(bux.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dm()).a(arw.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           elg $$8 = elg.a($$6);
                           hv $$9 = $$6.dm();
                           hv.a $$10 = new hv.a();

                           label45:
                           for (hv $$11 : hv.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ia.a)).b($$5x, $$11, $$8).c()) {
                                 for (ia $$12 : ia.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ia.a)).a(cwb.G)) {
                                       $$5.a(new bnp($$11));
                                       $$4.a(new bva(new bnp($$11), $$1, 0));
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
