import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxo {
   private static final int a = 60;

   public static bus<bth> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bye.a(
         (Function<bye.b<bth>, ? extends App<bye.c<bth>, byh<bth>>>)($$3 -> $$3.group($$3.c(ccc.o), $$3.c(ccc.m), $$3.a(ccc.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dp()).a(awa.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ja $$8 = $$6.dp();
                        ja.a $$9 = new ja.a();
                        ewe $$10 = ewe.a($$6);

                        for (ja $$11 : ja.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dsh $$12 = $$5x.a_($$11);
                              dsh $$13 = $$5x.a_($$9.a($$11, jf.a));
                              if (!$$12.a(dfh.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, jf.b)) {
                                 ja $$14 = $$11.i();
                                 $$5.a(new buu($$14));
                                 $$4.a(new ccf(new buu($$14), $$1, 1));
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
