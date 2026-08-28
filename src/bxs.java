import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxs {
   private static final int a = 60;

   public static buw<btl> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byi.a(
         (Function<byi.b<btl>, ? extends App<byi.c<btl>, byl<btl>>>)($$3 -> $$3.group($$3.c(ccg.o), $$3.c(ccg.m), $$3.a(ccg.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dr()).a(awc.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ja $$8 = $$6.dr();
                        ja.a $$9 = new ja.a();
                        ewm $$10 = ewm.a($$6);

                        for (ja $$11 : ja.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dsl $$12 = $$5x.a_($$11);
                              dsl $$13 = $$5x.a_($$9.a($$11, jf.a));
                              if (!$$12.a(dfk.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, jf.b)) {
                                 ja $$14 = $$11.i();
                                 $$5.a(new buy($$14));
                                 $$4.a(new ccj(new buy($$14), $$1, 1));
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
