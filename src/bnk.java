import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnk {
   private static final int a = 60;

   public static bkp<bjf> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boa.a(
         (Function<boa.b<bjf>, ? extends App<boa.c<bjf>, bod<bjf>>>)($$3 -> $$3.group($$3.c(bry.o), $$3.c(bry.m), $$3.a(bry.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dk()).a(apo.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        gv $$8 = $$6.dk();
                        gv.a $$9 = new gv.a();
                        ehk $$10 = ehk.a($$6);

                        for (gv $$11 : gv.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dey $$12 = $$5x.a_($$11);
                              dey $$13 = $$5x.a_($$9.a($$11, hb.a));
                              if (!$$12.a(csl.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, hb.b)) {
                                 gv $$14 = $$11.i();
                                 $$5.a(new bkr($$14));
                                 $$4.a(new bsb(new bkr($$14), $$1, 1));
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
