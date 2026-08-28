import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbx {
   private static final int a = 60;

   public static bzb<bxr> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return ccn.a(
         (Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$3 -> $$3.group($$3.c(cgl.p), $$3.c(cgl.n), $$3.a(cgl.o))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.du()).a(axh.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        iv $$8 = $$6.du();
                        iv.a $$9 = new iv.a();
                        ffh $$10 = ffh.a($$6);

                        for (iv $$11 : iv.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              eat $$12 = $$5x.a_($$11);
                              eat $$13 = $$5x.a_($$9.a($$11, jb.a));
                              if (!$$12.a(dmt.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jb.b)) {
                                 iv $$14 = $$11.j();
                                 $$5.a(new bzd($$14));
                                 $$4.a(new cgo(new bzd($$14), $$1, 1));
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
