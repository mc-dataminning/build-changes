import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bqa {
   public static bnd<blu> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bqo.a(
         (Function<bqo.b<blu>, ? extends App<bqo.c<blu>, bqr<blu>>>)($$3 -> $$3.group($$3.c(bum.o), $$3.c(bum.m), $$3.a(bum.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dn()).a(arp.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        hx $$8 = null;
                        hx $$9 = null;
                        hx $$10 = $$6.dn();

                        for (hx $$12 : hx.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dhn $$13 = $$6.dN().a_($$12.c());
                              dhn $$14 = $$6.dN().a_($$12);
                              if ($$14.a(cvh.G)) {
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
                           $$5.a(new bnf($$8));
                           $$4.a(new bup(new bnf($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
