import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bug {
   public static bri<bpx> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return buu.a(
         (Function<buu.b<bpx>, ? extends App<buu.c<bpx>, bux<bpx>>>)($$3 -> $$3.group($$3.c(bys.o), $$3.c(bys.m), $$3.a(bys.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dm()).a(aus.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ib $$8 = null;
                        ib $$9 = null;
                        ib $$10 = $$6.dm();

                        for (ib $$12 : ib.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dnb $$13 = $$6.dM().a_($$12.c());
                              dnb $$14 = $$6.dM().a_($$12);
                              if ($$14.a(dae.G)) {
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
                           $$5.a(new brk($$8));
                           $$4.a(new byv(new brk($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
