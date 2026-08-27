import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bpv {
   public static bmy<blp> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bqj.a(
         (Function<bqj.b<blp>, ? extends App<bqj.c<blp>, bqm<blp>>>)($$3 -> $$3.group($$3.c(buh.o), $$3.c(buh.m), $$3.a(buh.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dn()).a(arl.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ht $$8 = null;
                        ht $$9 = null;
                        ht $$10 = $$6.dn();

                        for (ht $$12 : ht.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dhi $$13 = $$6.dN().a_($$12.c());
                              dhi $$14 = $$6.dN().a_($$12);
                              if ($$14.a(cvc.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dl(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bna($$8));
                           $$4.a(new buk(new bna($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
