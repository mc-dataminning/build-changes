import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbz {
   public static bzb<bxr> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return ccn.a(
         (Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$3 -> $$3.group($$3.c(cgl.p), $$3.c(cgl.n), $$3.a(cgl.o))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.du()).a(axh.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        iv $$8 = null;
                        iv $$9 = null;
                        iv $$10 = $$6.du();

                        for (iv $$12 : iv.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              eao $$13 = $$6.dU().a_($$12.d());
                              eao $$14 = $$6.dU().a_($$12);
                              if ($$14.a(dmo.J)) {
                                 if ($$13.l()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.ds(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bzd($$8));
                           $$4.a(new cgo(new bzd($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
