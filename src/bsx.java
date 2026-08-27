import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bsx {
   private static final int a = 60;

   public static bqb<boq> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return btn.a(
         (Function<btn.b<boq>, ? extends App<btn.c<boq>, btq<boq>>>)($$3 -> $$3.group($$3.c(bxl.o), $$3.c(bxl.m), $$3.a(bxl.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dm()).a(auf.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        hz $$8 = $$6.dm();
                        hz.a $$9 = new hz.a();
                        eoe $$10 = eoe.a($$6);

                        for (hz $$11 : hz.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dlj $$12 = $$5x.a_($$11);
                              dlj $$13 = $$5x.a_($$9.a($$11, ie.a));
                              if (!$$12.a(cyu.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ie.b)) {
                                 hz $$14 = $$11.i();
                                 $$5.a(new bqd($$14));
                                 $$4.a(new bxo(new bqd($$14), $$1, 1));
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
