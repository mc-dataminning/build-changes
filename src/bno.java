import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bno {
   public static bkr<bjh> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return boc.a(
         (Function<boc.b<bjh>, ? extends App<boc.c<bjh>, bof<bjh>>>)($$3 -> $$3.group($$3.c(bsa.o), $$3.c(bsa.m), $$3.a(bsa.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dk()).a(apq.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        gu $$8 = null;
                        gu $$9 = null;
                        gu $$10 = $$6.dk();

                        for (gu $$12 : gu.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dfa $$13 = $$6.dK().a_($$12.c());
                              dfa $$14 = $$6.dK().a_($$12);
                              if ($$14.a(csn.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.di(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bkt($$8));
                           $$4.a(new bsd(new bkt($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
