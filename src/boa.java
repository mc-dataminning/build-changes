import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class boa {
   public static ble<bjv> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bop.a(
         (Function<bop.b<bjv>, ? extends App<bop.c<bjv>, bos<bjv>>>)($$3 -> $$3.group($$3.c(bsn.o), $$3.c(bsn.m), $$3.a(bsn.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dl()).a(aqa.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ehm $$8 = ehm.a($$6);
                           gw $$9 = $$6.dl();
                           gw.a $$10 = new gw.a();

                           label45:
                           for (gw $$11 : gw.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ha.a)).b($$5x, $$11, $$8).c()) {
                                 for (ha $$12 : ha.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ha.a)).a(cte.G)) {
                                       $$5.a(new blg($$11));
                                       $$4.a(new bsq(new blg($$11), $$1, 0));
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
