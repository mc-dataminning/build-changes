import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnu {
   public static bky<bjp> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boj.a(
         (Function<boj.b<bjp>, ? extends App<boj.c<bjp>, bom<bjp>>>)($$3 -> $$3.group($$3.c(bsh.o), $$3.c(bsh.m), $$3.a(bsh.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dl()).a(apy.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ehs $$8 = ehs.a($$6);
                           gw $$9 = $$6.dl();
                           gw.a $$10 = new gw.a();

                           label45:
                           for (gw $$11 : gw.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, hc.a)).b($$5x, $$11, $$8).c()) {
                                 for (hc $$12 : hc.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(hc.a)).a(csw.G)) {
                                       $$5.a(new bla($$11));
                                       $$4.a(new bsk(new bla($$11), $$1, 0));
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
