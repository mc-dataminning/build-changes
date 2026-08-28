import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byg {
   public static bvi<btw> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byu.a(
         (Function<byu.b<btw>, ? extends App<byu.c<btw>, byx<btw>>>)($$3 -> $$3.group($$3.c(ccs.o), $$3.c(ccs.m), $$3.a(ccs.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.do()).a(awk.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        jd $$8 = null;
                        jd $$9 = null;
                        jd $$10 = $$6.do();

                        for (jd $$12 : jd.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dtc $$13 = $$6.dO().a_($$12.d());
                              dtc $$14 = $$6.dO().a_($$12);
                              if ($$14.a(dga.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dm(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bvk($$8));
                           $$4.a(new ccv(new bvk($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
