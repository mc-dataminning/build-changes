import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bvt {
   private static final int a = 60;

   public static bsx<brm> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bwj.a(
         (Function<bwj.b<brm>, ? extends App<bwj.c<brm>, bwm<brm>>>)($$3 -> $$3.group($$3.c(cah.o), $$3.c(cah.m), $$3.a(cah.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dn()).a(avt.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        im $$8 = $$6.dn();
                        im.a $$9 = new im.a();
                        etk $$10 = etk.a($$6);

                        for (im $$11 : im.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dpy $$12 = $$5x.a_($$11);
                              dpy $$13 = $$5x.a_($$9.a($$11, ir.a));
                              if (!$$12.a(dcx.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ir.b)) {
                                 im $$14 = $$11.i();
                                 $$5.a(new bsz($$14));
                                 $$4.a(new cak(new bsz($$14), $$1, 1));
                                 break;
                              }
                           }
                        }

                        $$2.setValue($$7 + 60L);
                        return true;
                     }
                  }))
      );
   }
}
