import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bpu {
   public static bmy<blp> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bqj.a(
         (Function<bqj.b<blp>, ? extends App<bqj.c<blp>, bqm<blp>>>)($$3 -> $$3.group($$3.c(buh.o), $$3.c(buh.m), $$3.a(buh.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dn()).a(arl.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ejz $$8 = ejz.a($$6);
                           ht $$9 = $$6.dn();
                           ht.a $$10 = new ht.a();

                           label45:
                           for (ht $$11 : ht.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, hx.a)).b($$5x, $$11, $$8).c()) {
                                 for (hx $$12 : hx.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(hx.a)).a(cvc.G)) {
                                       $$5.a(new bna($$11));
                                       $$4.a(new buk(new bna($$11), $$1, 0));
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
