import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bqt {
   private static final int a = 60;

   public static bnx<bmo> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return brj.a(
         (Function<brj.b<bmo>, ? extends App<brj.c<bmo>, brm<bmo>>>)($$3 -> $$3.group($$3.c(bvh.o), $$3.c(bvh.m), $$3.a(bvh.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dm()).a(asg.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        hx $$8 = $$6.dm();
                        hx.a $$9 = new hx.a();
                        elr $$10 = elr.a($$6);

                        for (hx $$11 : hx.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dja $$12 = $$5x.a_($$11);
                              dja $$13 = $$5x.a_($$9.a($$11, ic.a));
                              if (!$$12.a(cwl.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ic.b)) {
                                 hx $$14 = $$11.i();
                                 $$5.a(new bnz($$14));
                                 $$4.a(new bvk(new bnz($$14), $$1, 1));
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
