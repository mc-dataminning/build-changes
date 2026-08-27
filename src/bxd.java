import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxd {
   private static final int a = 60;

   public static buh<bsw> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bxt.a(
         (Function<bxt.b<bsw>, ? extends App<bxt.c<bsw>, bxw<bsw>>>)($$3 -> $$3.group($$3.c(cbr.o), $$3.c(cbr.m), $$3.a(cbr.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.du()).a(awj.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ir $$8 = $$6.du();
                        ir.a $$9 = new ir.a();
                        ewz $$10 = ewz.a($$6);

                        for (ir $$11 : ir.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dtc $$12 = $$5x.a_($$11);
                              dtc $$13 = $$5x.a_($$9.a($$11, iw.a));
                              if (!$$12.a(dfe.al) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, iw.b)) {
                                 ir $$14 = $$11.i();
                                 $$5.a(new buj($$14));
                                 $$4.a(new cbu(new buj($$14), $$1, 1));
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
