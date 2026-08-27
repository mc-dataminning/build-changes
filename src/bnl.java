import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnl {
   private static final int a = 60;

   public static bkq<bjh> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bob.a(
         (Function<bob.b<bjh>, ? extends App<bob.c<bjh>, boe<bjh>>>)($$3 -> $$3.group($$3.c(brz.o), $$3.c(brz.m), $$3.a(brz.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dk()).a(apq.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        gu $$8 = $$6.dk();
                        gu.a $$9 = new gu.a();
                        ehi $$10 = ehi.a($$6);

                        for (gu $$11 : gu.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dez $$12 = $$5x.a_($$11);
                              dez $$13 = $$5x.a_($$9.a($$11, ha.a));
                              if (!$$12.a(csm.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ha.b)) {
                                 gu $$14 = $$11.i();
                                 $$5.a(new bks($$14));
                                 $$4.a(new bsc(new bks($$14), $$1, 1));
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
