import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class buf {
   public static bri<bpx> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return buu.a(
         (Function<buu.b<bpx>, ? extends App<buu.c<bpx>, bux<bpx>>>)($$3 -> $$3.group($$3.c(bys.o), $$3.c(bys.m), $$3.a(bys.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dm()).a(aus.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           epy $$8 = epy.a($$6);
                           ib $$9 = $$6.dm();
                           ib.a $$10 = new ib.a();

                           label45:
                           for (ib $$11 : ib.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ih.a)).b($$5x, $$11, $$8).c()) {
                                 for (ih $$12 : ih.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ih.a)).a(dae.G)) {
                                       $$5.a(new brk($$11));
                                       $$4.a(new byv(new brk($$11), $$1, 0));
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
