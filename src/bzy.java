import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzy {
   public static bxb<bvp> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return can.a(
         (Function<can.b<bvp>, ? extends App<can.c<bvp>, caq<bvp>>>)($$3 -> $$3.group($$3.c(cel.o), $$3.c(cel.m), $$3.a(cel.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dv()).a(axi.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           fad $$8 = fad.a($$6);
                           jh $$9 = $$6.dv();
                           jh.a $$10 = new jh.a();

                           label45:
                           for (jh $$11 : jh.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jm.a)).b($$5x, $$11, $$8).c()) {
                                 for (jm $$12 : jm.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jm.a)).a(dis.G)) {
                                       $$5.a(new bxd($$11));
                                       $$4.a(new ceo(new bxd($$11), $$1, 0));
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
