import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bqz {
   private static final int a = 60;

   public static bod<bmu> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return brp.a(
         (Function<brp.b<bmu>, ? extends App<brp.c<bmu>, brs<bmu>>>)($$3 -> $$3.group($$3.c(bvn.o), $$3.c(bvn.m), $$3.a(bvn.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dm()).a(asm.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        hx $$8 = $$6.dm();
                        hx.a $$9 = new hx.a();
                        ely $$10 = ely.a($$6);

                        for (hx $$11 : hx.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              djh $$12 = $$5x.a_($$11);
                              djh $$13 = $$5x.a_($$9.a($$11, ic.a));
                              if (!$$12.a(cws.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ic.b)) {
                                 hx $$14 = $$11.i();
                                 $$5.a(new bof($$14));
                                 $$4.a(new bvq(new bof($$14), $$1, 1));
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
