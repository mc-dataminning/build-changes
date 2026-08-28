import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzd {
   public static bwg<buv> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bzs.a(
         (Function<bzs.b<buv>, ? extends App<bzs.c<buv>, bzv<buv>>>)($$3 -> $$3.group($$3.c(cdq.o), $$3.c(cdq.m), $$3.a(cdq.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.ds()).a(axb.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ezb $$8 = ezb.a($$6);
                           jf $$9 = $$6.ds();
                           jf.a $$10 = new jf.a();

                           label45:
                           for (jf $$11 : jf.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jk.a)).b($$5x, $$11, $$8).c()) {
                                 for (jk $$12 : jk.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jk.a)).a(dho.G)) {
                                       $$5.a(new bwi($$11));
                                       $$4.a(new cdt(new bwi($$11), $$1, 0));
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
