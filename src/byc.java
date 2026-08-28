import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byc {
   private static final int a = 60;

   public static bvg<btu> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bys.a(
         (Function<bys.b<btu>, ? extends App<bys.c<btu>, byv<btu>>>)($$3 -> $$3.group($$3.c(ccq.o), $$3.c(ccq.m), $$3.a(ccq.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dq()).a(awj.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        jd $$8 = $$6.dq();
                        jd.a $$9 = new jd.a();
                        exb $$10 = exb.a($$6);

                        for (jd $$11 : jd.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dta $$12 = $$5x.a_($$11);
                              dta $$13 = $$5x.a_($$9.a($$11, ji.a));
                              if (!$$12.a(dfy.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ji.b)) {
                                 jd $$14 = $$11.i();
                                 $$5.a(new bvi($$14));
                                 $$4.a(new cct(new bvi($$14), $$1, 1));
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
