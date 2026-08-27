import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bvu {
   public static bsx<brm> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bwj.a(
         (Function<bwj.b<brm>, ? extends App<bwj.c<brm>, bwm<brm>>>)($$3 -> $$3.group($$3.c(cah.o), $$3.c(cah.m), $$3.a(cah.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dn()).a(avt.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           etk $$8 = etk.a($$6);
                           im $$9 = $$6.dn();
                           im.a $$10 = new im.a();

                           label45:
                           for (im $$11 : im.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ir.a)).b($$5x, $$11, $$8).c()) {
                                 for (ir $$12 : ir.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ir.a)).a(dcx.G)) {
                                       $$5.a(new bsz($$11));
                                       $$4.a(new cak(new bsz($$11), $$1, 0));
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
