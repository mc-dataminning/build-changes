import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bsy {
   public static bqb<boq> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return btn.a(
         (Function<btn.b<boq>, ? extends App<btn.c<boq>, btq<boq>>>)($$3 -> $$3.group($$3.c(bxl.o), $$3.c(bxl.m), $$3.a(bxl.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dm()).a(auf.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           eoe $$8 = eoe.a($$6);
                           hz $$9 = $$6.dm();
                           hz.a $$10 = new hz.a();

                           label45:
                           for (hz $$11 : hz.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ie.a)).b($$5x, $$11, $$8).c()) {
                                 for (ie $$12 : ie.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ie.a)).a(cyu.G)) {
                                       $$5.a(new bqd($$11));
                                       $$4.a(new bxo(new bqd($$11), $$1, 0));
                                       break label45;
                                    }
                                 }
                              }
                           }

                           $$2.setValue($$7 + 40L);
                           return true;
                        }
                     }
               ))
      );
   }
}
