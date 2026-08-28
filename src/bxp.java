import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxp {
   public static bus<bth> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bye.a(
         (Function<bye.b<bth>, ? extends App<bye.c<bth>, byh<bth>>>)($$3 -> $$3.group($$3.c(ccc.o), $$3.c(ccc.m), $$3.a(ccc.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dp()).a(awa.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ewe $$8 = ewe.a($$6);
                           ja $$9 = $$6.dp();
                           ja.a $$10 = new ja.a();

                           label45:
                           for (ja $$11 : ja.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jf.a)).b($$5x, $$11, $$8).c()) {
                                 for (jf $$12 : jf.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(jf.a)).a(dfh.G)) {
                                       $$5.a(new buu($$11));
                                       $$4.a(new ccf(new buu($$11), $$1, 0));
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
