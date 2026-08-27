import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class brc {
   private static final int a = 60;

   public static bog<bmx> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return brs.a(
         (Function<brs.b<bmx>, ? extends App<brs.c<bmx>, brv<bmx>>>)($$3 -> $$3.group($$3.c(bvq.o), $$3.c(bvq.m), $$3.a(bvq.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dl()).a(asn.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        hx $$8 = $$6.dl();
                        hx.a $$9 = new hx.a();
                        emh $$10 = emh.a($$6);

                        for (hx $$11 : hx.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              djp $$12 = $$5x.a_($$11);
                              djp $$13 = $$5x.a_($$9.a($$11, ic.a));
                              if (!$$12.a(cxa.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ic.b)) {
                                 hx $$14 = $$11.i();
                                 $$5.a(new boi($$14));
                                 $$4.a(new bvt(new boi($$14), $$1, 1));
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
