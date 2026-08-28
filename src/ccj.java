import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class ccj {
   public static bzm<byc> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return ccy.a(
         (Function<ccy.b<byc>, ? extends App<ccy.c<byc>, cdb<byc>>>)($$3 -> $$3.group($$3.c(cgw.p), $$3.c(cgw.n), $$3.a(cgw.o))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dv()).a(axj.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ffv $$8 = ffv.a($$6);
                           iv $$9 = $$6.dv();
                           iv.a $$10 = new iv.a();

                           label45:
                           for (iv $$11 : iv.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jb.a)).b($$5x, $$11, $$8).c()) {
                                 for (jb $$12 : jb.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jb.a)).a(dne.J)) {
                                       $$5.a(new bzo($$11));
                                       $$4.a(new cgz(new bzo($$11), $$1, 0));
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
