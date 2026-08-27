import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bpy {
   private static final int a = 60;

   public static bnd<blu> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bqo.a(
         (Function<bqo.b<blu>, ? extends App<bqo.c<blu>, bqr<blu>>>)($$3 -> $$3.group($$3.c(bum.o), $$3.c(bum.m), $$3.a(bum.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dn()).a(arp.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        hx $$8 = $$6.dn();
                        hx.a $$9 = new hx.a();
                        eke $$10 = eke.a($$6);

                        for (hx $$11 : hx.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dhn $$12 = $$5x.a_($$11);
                              dhn $$13 = $$5x.a_($$9.a($$11, ib.a));
                              if (!$$12.a(cvh.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ib.b)) {
                                 hx $$14 = $$11.i();
                                 $$5.a(new bnf($$14));
                                 $$4.a(new bup(new bnf($$14), $$1, 1));
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
