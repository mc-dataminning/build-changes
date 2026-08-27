import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bvd {
   private static final int a = 60;

   public static bsh<bqw> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bvt.a(
         (Function<bvt.b<bqw>, ? extends App<bvt.c<bqw>, bvw<bqw>>>)($$3 -> $$3.group($$3.c(bzr.o), $$3.c(bzr.m), $$3.a(bzr.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dm()).a(avh.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ib $$8 = $$6.dm();
                        ib.a $$9 = new ib.a();
                        esf $$10 = esf.a($$6);

                        for (ib $$11 : ib.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              doz $$12 = $$5x.a_($$11);
                              doz $$13 = $$5x.a_($$9.a($$11, ih.a));
                              if (!$$12.a(dca.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ih.b)) {
                                 ib $$14 = $$11.i();
                                 $$5.a(new bsj($$14));
                                 $$4.a(new bzu(new bsj($$14), $$1, 1));
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
