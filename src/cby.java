import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cby {
   public static bzb<bxr> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return ccn.a(
         (Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$3 -> $$3.group($$3.c(cgl.p), $$3.c(cgl.n), $$3.a(cgl.o))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.du()).a(axh.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ffc $$8 = ffc.a($$6);
                           iv $$9 = $$6.du();
                           iv.a $$10 = new iv.a();

                           label45:
                           for (iv $$11 : iv.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jb.a)).b($$5x, $$11, $$8).c()) {
                                 for (jb $$12 : jb.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jb.a)).a(dmo.J)) {
                                       $$5.a(new bzd($$11));
                                       $$4.a(new cgo(new bzd($$11), $$1, 0));
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
