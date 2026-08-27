import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnm {
   public static bkq<bjh> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bob.a(
         (Function<bob.b<bjh>, ? extends App<bob.c<bjh>, boe<bjh>>>)($$3 -> $$3.group($$3.c(brz.o), $$3.c(brz.m), $$3.a(brz.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dk()).a(apq.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ehi $$8 = ehi.a($$6);
                           gu $$9 = $$6.dk();
                           gu.a $$10 = new gu.a();

                           label45:
                           for (gu $$11 : gu.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ha.a)).b($$5x, $$11, $$8).c()) {
                                 for (ha $$12 : ha.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ha.a)).a(csm.G)) {
                                       $$5.a(new bks($$11));
                                       $$4.a(new bsc(new bks($$11), $$1, 0));
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
