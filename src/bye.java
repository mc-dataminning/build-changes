import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bye {
   private static final int a = 60;

   public static bvi<btx> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byu.a(
         (Function<byu.b<btx>, ? extends App<byu.c<btx>, byx<btx>>>)($$3 -> $$3.group($$3.c(ccs.o), $$3.c(ccs.m), $$3.a(ccs.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dp()).a(awu.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        iz $$8 = $$6.dp();
                        iz.a $$9 = new iz.a();
                        evv $$10 = evv.a($$6);

                        for (iz $$11 : iz.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dsb $$12 = $$5x.a_($$11);
                              dsb $$13 = $$5x.a_($$9.a($$11, je.a));
                              if (!$$12.a(dfa.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, je.b)) {
                                 iz $$14 = $$11.i();
                                 $$5.a(new bvk($$14));
                                 $$4.a(new ccv(new bvk($$14), $$1, 1));
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
