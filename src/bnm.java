import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnm {
   private static final int a = 60;

   public static bkr<bjh> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boc.a(
         (Function<boc.b<bjh>, ? extends App<boc.c<bjh>, bof<bjh>>>)($$3 -> $$3.group($$3.c(bsa.o), $$3.c(bsa.m), $$3.a(bsa.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dk()).a(apq.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        gu $$8 = $$6.dk();
                        gu.a $$9 = new gu.a();
                        ehj $$10 = ehj.a($$6);

                        for (gu $$11 : gu.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dfa $$12 = $$5x.a_($$11);
                              dfa $$13 = $$5x.a_($$9.a($$11, ha.a));
                              if (!$$12.a(csn.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ha.b)) {
                                 gu $$14 = $$11.i();
                                 $$5.a(new bkt($$14));
                                 $$4.a(new bsd(new bkt($$14), $$1, 1));
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
