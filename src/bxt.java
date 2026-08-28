import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxt {
   public static buw<btl> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byi.a(
         (Function<byi.b<btl>, ? extends App<byi.c<btl>, byl<btl>>>)($$3 -> $$3.group($$3.c(ccg.o), $$3.c(ccg.m), $$3.a(ccg.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dr()).a(awc.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ewm $$8 = ewm.a($$6);
                           ja $$9 = $$6.dr();
                           ja.a $$10 = new ja.a();

                           label45:
                           for (ja $$11 : ja.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jf.a)).b($$5x, $$11, $$8).c()) {
                                 for (jf $$12 : jf.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(jf.a)).a(dfk.G)) {
                                       $$5.a(new buy($$11));
                                       $$4.a(new ccj(new buy($$11), $$1, 0));
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
