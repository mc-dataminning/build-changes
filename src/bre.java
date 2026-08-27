import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bre {
   public static bog<bmx> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return brs.a(
         (Function<brs.b<bmx>, ? extends App<brs.c<bmx>, brv<bmx>>>)($$3 -> $$3.group($$3.c(bvq.o), $$3.c(bvq.m), $$3.a(bvq.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dl()).a(asn.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        hx $$8 = null;
                        hx $$9 = null;
                        hx $$10 = $$6.dl();

                        for (hx $$12 : hx.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              djp $$13 = $$6.dL().a_($$12.c());
                              djp $$14 = $$6.dL().a_($$12);
                              if ($$14.a(cxa.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dj(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new boi($$8));
                           $$4.a(new bvt(new boi($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
