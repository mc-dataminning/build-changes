import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bsz {
   public static bqb<boq> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return btn.a(
         (Function<btn.b<boq>, ? extends App<btn.c<boq>, btq<boq>>>)($$3 -> $$3.group($$3.c(bxl.o), $$3.c(bxl.m), $$3.a(bxl.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dm()).a(auf.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        hz $$8 = null;
                        hz $$9 = null;
                        hz $$10 = $$6.dm();

                        for (hz $$12 : hz.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dlj $$13 = $$6.dM().a_($$12.c());
                              dlj $$14 = $$6.dM().a_($$12);
                              if ($$14.a(cyu.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dk(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bqd($$8));
                           $$4.a(new bxo(new bqd($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
