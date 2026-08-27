import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnw {
   public static bla<bjr> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bol.a(
         (Function<bol.b<bjr>, ? extends App<bol.c<bjr>, boo<bjr>>>)($$3 -> $$3.group($$3.c(bsj.o), $$3.c(bsj.m), $$3.a(bsj.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dl()).a(apz.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ehu $$8 = ehu.a($$6);
                           gw $$9 = $$6.dl();
                           gw.a $$10 = new gw.a();

                           label45:
                           for (gw $$11 : gw.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, hc.a)).b($$5x, $$11, $$8).c()) {
                                 for (hc $$12 : hc.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(hc.a)).a(csy.G)) {
                                       $$5.a(new blc($$11));
                                       $$4.a(new bsm(new blc($$11), $$1, 0));
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
