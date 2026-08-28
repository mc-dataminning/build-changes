import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbs {
   private static final int a = 60;

   public static byw<bxm> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cci.a(
         (Function<cci.b<bxm>, ? extends App<cci.c<bxm>, ccl<bxm>>>)($$3 -> $$3.group($$3.c(cgg.p), $$3.c(cgg.n), $$3.a(cgg.o))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dv()).a(axh.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        iu $$8 = $$6.dv();
                        iu.a $$9 = new iu.a();
                        fev $$10 = fev.a($$6);

                        for (iu $$11 : iu.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              eah $$12 = $$5x.a_($$11);
                              eah $$13 = $$5x.a_($$9.a($$11, ja.a));
                              if (!$$12.a(dmh.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, ja.b)) {
                                 iu $$14 = $$11.j();
                                 $$5.a(new byy($$14));
                                 $$4.a(new cgj(new byy($$14), $$1, 1));
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
