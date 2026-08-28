import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bye {
   public static bvg<btu> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bys.a(
         (Function<bys.b<btu>, ? extends App<bys.c<btu>, byv<btu>>>)($$3 -> $$3.group($$3.c(ccq.o), $$3.c(ccq.m), $$3.a(ccq.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dq()).a(awj.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        jd $$8 = null;
                        jd $$9 = null;
                        jd $$10 = $$6.dq();

                        for (jd $$12 : jd.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dta $$13 = $$6.dQ().a_($$12.c());
                              dta $$14 = $$6.dQ().a_($$12);
                              if ($$14.a(dfy.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.do(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bvi($$8));
                           $$4.a(new cct(new bvi($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
