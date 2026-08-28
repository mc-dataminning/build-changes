import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxt {
   public static buv<btk> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byh.a(
         (Function<byh.b<btk>, ? extends App<byh.c<btk>, byk<btk>>>)($$3 -> $$3.group($$3.c(ccf.o), $$3.c(ccf.m), $$3.a(ccf.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dq()).a(awc.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ja $$8 = null;
                        ja $$9 = null;
                        ja $$10 = $$6.dq();

                        for (ja $$12 : ja.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dsk $$13 = $$6.dQ().a_($$12.c());
                              dsk $$14 = $$6.dQ().a_($$12);
                              if ($$14.a(dfj.G)) {
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
                           $$5.a(new bux($$8));
                           $$4.a(new cci(new bux($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
