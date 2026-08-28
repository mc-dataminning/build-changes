import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byf {
   public static bvh<btw> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byt.a(
         (Function<byt.b<btw>, ? extends App<byt.c<btw>, byw<btw>>>)($$3 -> $$3.group($$3.c(ccr.o), $$3.c(ccr.m), $$3.a(ccr.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dp()).a(awu.a)) {
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
                              dsa $$13 = $$6.dP().a_($$12.c());
                              dsa $$14 = $$6.dP().a_($$12);
                              if ($$14.a(dez.G)) {
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
                           $$5.a(new bvj($$8));
                           $$4.a(new ccu(new bvj($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
