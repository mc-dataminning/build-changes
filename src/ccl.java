import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class ccl {
   public static bzo<bye> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cda.a(
         (Function<cda.b<bye>, ? extends App<cda.c<bye>, cdd<bye>>>)($$3 -> $$3.group($$3.c(cgy.p), $$3.c(cgy.n), $$3.a(cgy.o))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dv()).a(axl.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ffx $$8 = ffx.a($$6);
                           iw $$9 = $$6.dv();
                           iw.a $$10 = new iw.a();

                           label45:
                           for (iw $$11 : iw.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jc.a)).b($$5x, $$11, $$8).c()) {
                                 for (jc $$12 : jc.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jc.a)).a(dng.J)) {
                                       $$5.a(new bzq($$11));
                                       $$4.a(new chb(new bzq($$11), $$1, 0));
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
