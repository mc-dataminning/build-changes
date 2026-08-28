import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzc {
   private static final int a = 60;

   public static bwg<buv> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bzs.a(
         (Function<bzs.b<buv>, ? extends App<bzs.c<buv>, bzv<buv>>>)($$3 -> $$3.group($$3.c(cdq.o), $$3.c(cdq.m), $$3.a(cdq.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.ds()).a(axb.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        jf $$8 = $$6.ds();
                        jf.a $$9 = new jf.a();
                        ezb $$10 = ezb.a($$6);

                        for (jf $$11 : jf.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dus $$12 = $$5x.a_($$11);
                              dus $$13 = $$5x.a_($$9.a($$11, jk.a));
                              if (!$$12.a(dho.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jk.b)) {
                                 jf $$14 = $$11.j();
                                 $$5.a(new bwi($$14));
                                 $$4.a(new cdt(new bwi($$14), $$1, 1));
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
