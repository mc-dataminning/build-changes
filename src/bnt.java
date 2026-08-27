import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnt {
   private static final int a = 60;

   public static bky<bjp> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boj.a(
         (Function<boj.b<bjp>, ? extends App<boj.c<bjp>, bom<bjp>>>)($$3 -> $$3.group($$3.c(bsh.o), $$3.c(bsh.m), $$3.a(bsh.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dl()).a(apy.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        gw $$8 = $$6.dl();
                        gw.a $$9 = new gw.a();
                        ehs $$10 = ehs.a($$6);

                        for (gw $$11 : gw.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dfj $$12 = $$5x.a_($$11);
                              dfj $$13 = $$5x.a_($$9.a($$11, hc.a));
                              if (!$$12.a(csw.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, hc.b)) {
                                 gw $$14 = $$11.i();
                                 $$5.a(new bla($$14));
                                 $$4.a(new bsk(new bla($$14), $$1, 1));
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
