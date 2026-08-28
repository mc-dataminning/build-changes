import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxq {
   public static bus<bth> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bye.a(
         (Function<bye.b<bth>, ? extends App<bye.c<bth>, byh<bth>>>)($$3 -> $$3.group($$3.c(ccc.o), $$3.c(ccc.m), $$3.a(ccc.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dp()).a(awa.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ja $$8 = null;
                        ja $$9 = null;
                        ja $$10 = $$6.dp();

                        for (ja $$12 : ja.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dsh $$13 = $$6.dP().a_($$12.c());
                              dsh $$14 = $$6.dP().a_($$12);
                              if ($$14.a(dfh.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dn(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new buu($$8));
                           $$4.a(new ccf(new buu($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
