import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bvj {
   public static bsm<brb> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bvy.a(
         (Function<bvy.b<brb>, ? extends App<bvy.c<brb>, bwb<brb>>>)($$3 -> $$3.group($$3.c(bzw.o), $$3.c(bzw.m), $$3.a(bzw.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dm()).a(avj.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           eso $$8 = eso.a($$6);
                           id $$9 = $$6.dm();
                           id.a $$10 = new id.a();

                           label45:
                           for (id $$11 : id.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ij.a)).b($$5x, $$11, $$8).c()) {
                                 for (ij $$12 : ij.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ij.a)).a(dcj.G)) {
                                       $$5.a(new bso($$11));
                                       $$4.a(new bzz(new bso($$11), $$1, 0));
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
