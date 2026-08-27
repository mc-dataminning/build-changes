import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bqy {
   private static final int a = 60;

   public static boc<bmt> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bro.a(
         (Function<bro.b<bmt>, ? extends App<bro.c<bmt>, brr<bmt>>>)($$3 -> $$3.group($$3.c(bvm.o), $$3.c(bvm.m), $$3.a(bvm.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dm()).a(asl.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        hx $$8 = $$6.dm();
                        hx.a $$9 = new hx.a();
                        elx $$10 = elx.a($$6);

                        for (hx $$11 : hx.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              djg $$12 = $$5x.a_($$11);
                              djg $$13 = $$5x.a_($$9.a($$11, ic.a));
                              if (!$$12.a(cwr.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ic.b)) {
                                 hx $$14 = $$11.i();
                                 $$5.a(new boe($$14));
                                 $$4.a(new bvp(new boe($$14), $$1, 1));
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
