import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byc {
   public static bve<btt> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byq.a(
         (Function<byq.b<btt>, ? extends App<byq.c<btt>, byt<btt>>>)($$3 -> $$3.group($$3.c(cco.o), $$3.c(cco.m), $$3.a(cco.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dp()).a(awr.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        iz $$8 = null;
                        iz $$9 = null;
                        iz $$10 = $$6.dp();

                        for (iz $$12 : iz.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              drx $$13 = $$6.dP().a_($$12.c());
                              drx $$14 = $$6.dP().a_($$12);
                              if ($$14.a(dew.G)) {
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
                           $$5.a(new bvg($$8));
                           $$4.a(new ccr(new bvg($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
