import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byf {
   public static bvi<btx> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byu.a(
         (Function<byu.b<btx>, ? extends App<byu.c<btx>, byx<btx>>>)($$3 -> $$3.group($$3.c(ccs.o), $$3.c(ccs.m), $$3.a(ccs.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dp()).a(awu.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           evv $$8 = evv.a($$6);
                           iz $$9 = $$6.dp();
                           iz.a $$10 = new iz.a();

                           label45:
                           for (iz $$11 : iz.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, je.a)).b($$5x, $$11, $$8).c()) {
                                 for (je $$12 : je.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(je.a)).a(dfa.G)) {
                                       $$5.a(new bvk($$11));
                                       $$4.a(new ccv(new bvk($$11), $$1, 0));
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
