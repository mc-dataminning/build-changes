import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byz {
   private static final int a = 60;

   public static bwd<bus> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bzp.a(
         (Function<bzp.b<bus>, ? extends App<bzp.c<bus>, bzs<bus>>>)($$3 -> $$3.group($$3.c(cdn.o), $$3.c(cdn.m), $$3.a(cdn.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.ds()).a(awz.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        je $$8 = $$6.ds();
                        je.a $$9 = new je.a();
                        eyx $$10 = eyx.a($$6);

                        for (je $$11 : je.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              duo $$12 = $$5x.a_($$11);
                              duo $$13 = $$5x.a_($$9.a($$11, jj.a));
                              if (!$$12.a(dhl.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jj.b)) {
                                 je $$14 = $$11.j();
                                 $$5.a(new bwf($$14));
                                 $$4.a(new cdq(new bwf($$14), $$1, 1));
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
