import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnm {
   public static bkp<bjf> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boa.a(
         (Function<boa.b<bjf>, ? extends App<boa.c<bjf>, bod<bjf>>>)($$3 -> $$3.group($$3.c(bry.o), $$3.c(bry.m), $$3.a(bry.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dk()).a(apo.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        gv $$8 = null;
                        gv $$9 = null;
                        gv $$10 = $$6.dk();

                        for (gv $$12 : gv.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dey $$13 = $$6.dK().a_($$12.c());
                              dey $$14 = $$6.dK().a_($$12);
                              if ($$14.a(csl.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.di(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bkr($$8));
                           $$4.a(new bsb(new bkr($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
