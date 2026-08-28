import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzb {
   public static bwd<bus> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bzp.a(
         (Function<bzp.b<bus>, ? extends App<bzp.c<bus>, bzs<bus>>>)($$3 -> $$3.group($$3.c(cdn.o), $$3.c(cdn.m), $$3.a(cdn.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.ds()).a(awz.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        je $$8 = null;
                        je $$9 = null;
                        je $$10 = $$6.ds();

                        for (je $$12 : je.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              duo $$13 = $$6.dS().a_($$12.d());
                              duo $$14 = $$6.dS().a_($$12);
                              if ($$14.a(dhl.G)) {
                                 if ($$13.l()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dq(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bwf($$8));
                           $$4.a(new cdq(new bwf($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
