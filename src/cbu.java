import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbu {
   public static byw<bxm> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cci.a(
         (Function<cci.b<bxm>, ? extends App<cci.c<bxm>, ccl<bxm>>>)($$3 -> $$3.group($$3.c(cgg.p), $$3.c(cgg.n), $$3.a(cgg.o))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dv()).a(axh.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        iu $$8 = null;
                        iu $$9 = null;
                        iu $$10 = $$6.dv();

                        for (iu $$12 : iu.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              eah $$13 = $$6.dV().a_($$12.d());
                              eah $$14 = $$6.dV().a_($$12);
                              if ($$14.a(dmh.J)) {
                                 if ($$13.l()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dt(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new byy($$8));
                           $$4.a(new cgj(new byy($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
