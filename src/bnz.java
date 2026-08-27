import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnz {
   private static final int a = 60;

   public static ble<bjv> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bop.a(
         (Function<bop.b<bjv>, ? extends App<bop.c<bjv>, bos<bjv>>>)($$3 -> $$3.group($$3.c(bsn.o), $$3.c(bsn.m), $$3.a(bsn.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dl()).a(aqa.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        gw $$8 = $$6.dl();
                        gw.a $$9 = new gw.a();
                        ehm $$10 = ehm.a($$6);

                        for (gw $$11 : gw.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dfd $$12 = $$5x.a_($$11);
                              dfd $$13 = $$5x.a_($$9.a($$11, ha.a));
                              if (!$$12.a(cte.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ha.b)) {
                                 gw $$14 = $$11.i();
                                 $$5.a(new blg($$14));
                                 $$4.a(new bsq(new blg($$14), $$1, 1));
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
