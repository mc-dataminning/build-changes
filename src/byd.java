import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byd {
   public static bvg<btu> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bys.a(
         (Function<bys.b<btu>, ? extends App<bys.c<btu>, byv<btu>>>)($$3 -> $$3.group($$3.c(ccq.o), $$3.c(ccq.m), $$3.a(ccq.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dq()).a(awj.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           exb $$8 = exb.a($$6);
                           jd $$9 = $$6.dq();
                           jd.a $$10 = new jd.a();

                           label45:
                           for (jd $$11 : jd.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ji.a)).b($$5x, $$11, $$8).c()) {
                                 for (ji $$12 : ji.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ji.a)).a(dfy.G)) {
                                       $$5.a(new bvi($$11));
                                       $$4.a(new cct(new bvi($$11), $$1, 0));
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
