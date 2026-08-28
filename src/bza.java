import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bza {
   public static bwd<bus> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bzp.a(
         (Function<bzp.b<bus>, ? extends App<bzp.c<bus>, bzs<bus>>>)($$3 -> $$3.group($$3.c(cdn.o), $$3.c(cdn.m), $$3.a(cdn.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.ds()).a(awz.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           eyx $$8 = eyx.a($$6);
                           je $$9 = $$6.ds();
                           je.a $$10 = new je.a();

                           label45:
                           for (je $$11 : je.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jj.a)).b($$5x, $$11, $$8).c()) {
                                 for (jj $$12 : jj.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jj.a)).a(dhl.G)) {
                                       $$5.a(new bwf($$11));
                                       $$4.a(new cdq(new bwf($$11), $$1, 0));
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
