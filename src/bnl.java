import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnl {
   public static bkp<bjf> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boa.a(
         (Function<boa.b<bjf>, ? extends App<boa.c<bjf>, bod<bjf>>>)($$3 -> $$3.group($$3.c(bry.o), $$3.c(bry.m), $$3.a(bry.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dk()).a(apo.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ehk $$8 = ehk.a($$6);
                           gv $$9 = $$6.dk();
                           gv.a $$10 = new gv.a();

                           label45:
                           for (gv $$11 : gv.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, hb.a)).b($$5x, $$11, $$8).c()) {
                                 for (hb $$12 : hb.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(hb.a)).a(csl.G)) {
                                       $$5.a(new bkr($$11));
                                       $$4.a(new bsb(new bkr($$11), $$1, 0));
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
