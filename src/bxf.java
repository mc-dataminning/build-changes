import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxf {
   public static buh<bsw> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bxt.a(
         (Function<bxt.b<bsw>, ? extends App<bxt.c<bsw>, bxw<bsw>>>)($$3 -> $$3.group($$3.c(cbr.o), $$3.c(cbr.m), $$3.a(cbr.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.du()).a(awj.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ir $$8 = null;
                        ir $$9 = null;
                        ir $$10 = $$6.du();

                        for (ir $$12 : ir.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dtc $$13 = $$6.dU().a_($$12.c());
                              dtc $$14 = $$6.dU().a_($$12);
                              if ($$14.a(dfe.al)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.ds(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new buj($$8));
                           $$4.a(new cbu(new buj($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
