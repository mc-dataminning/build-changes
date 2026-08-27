import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bwq {
   public static btt<bsi> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bxf.a(
         (Function<bxf.b<bsi>, ? extends App<bxf.c<bsi>, bxi<bsi>>>)($$3 -> $$3.group($$3.c(cbd.o), $$3.c(cbd.m), $$3.a(cbd.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dn()).a(avw.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           etu $$8 = etu.a($$6);
                           in $$9 = $$6.dn();
                           in.a $$10 = new in.a();

                           label45:
                           for (in $$11 : in.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, is.a)).b($$5x, $$11, $$8).c()) {
                                 for (is $$12 : is.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(is.a)).a(ddg.G)) {
                                       $$5.a(new btv($$11));
                                       $$4.a(new cbg(new btv($$11), $$1, 0));
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
