import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byb {
   public static bve<btt> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return byq.a(
         (Function<byq.b<btt>, ? extends App<byq.c<btt>, byt<btt>>>)($$3 -> $$3.group($$3.c(cco.o), $$3.c(cco.m), $$3.a(cco.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dp()).a(awr.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           evr $$8 = evr.a($$6);
                           iz $$9 = $$6.dp();
                           iz.a $$10 = new iz.a();

                           label45:
                           for (iz $$11 : iz.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, je.a)).b($$5x, $$11, $$8).c()) {
                                 for (je $$12 : je.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(je.a)).a(dew.G)) {
                                       $$5.a(new bvg($$11));
                                       $$4.a(new ccr(new bvg($$11), $$1, 0));
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
