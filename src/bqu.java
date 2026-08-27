import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bqu {
   public static bnx<bmo> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return brj.a(
         (Function<brj.b<bmo>, ? extends App<brj.c<bmo>, brm<bmo>>>)($$3 -> $$3.group($$3.c(bvh.o), $$3.c(bvh.m), $$3.a(bvh.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dm()).a(asg.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           elr $$8 = elr.a($$6);
                           hx $$9 = $$6.dm();
                           hx.a $$10 = new hx.a();

                           label45:
                           for (hx $$11 : hx.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ic.a)).b($$5x, $$11, $$8).c()) {
                                 for (ic $$12 : ic.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ic.a)).a(cwl.G)) {
                                       $$5.a(new bnz($$11));
                                       $$4.a(new bvk(new bnz($$11), $$1, 0));
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
