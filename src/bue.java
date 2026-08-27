import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bue {
   private static final int a = 60;

   public static bri<bpx> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return buu.a(
         (Function<buu.b<bpx>, ? extends App<buu.c<bpx>, bux<bpx>>>)($$3 -> $$3.group($$3.c(bys.o), $$3.c(bys.m), $$3.a(bys.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dm()).a(aus.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ib $$8 = $$6.dm();
                        ib.a $$9 = new ib.a();
                        epy $$10 = epy.a($$6);

                        for (ib $$11 : ib.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dnb $$12 = $$5x.a_($$11);
                              dnb $$13 = $$5x.a_($$9.a($$11, ih.a));
                              if (!$$12.a(dae.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ih.b)) {
                                 ib $$14 = $$11.i();
                                 $$5.a(new brk($$14));
                                 $$4.a(new byv(new brk($$14), $$1, 1));
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
