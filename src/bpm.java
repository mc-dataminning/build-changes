import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bpm {
   public static bmq<blh> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bqb.a(
         (Function<bqb.b<blh>, ? extends App<bqb.c<blh>, bqe<blh>>>)($$3 -> $$3.group($$3.c(btz.o), $$3.c(btz.m), $$3.a(btz.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dl()).a(arh.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ejn $$8 = ejn.a($$6);
                           ht $$9 = $$6.dl();
                           ht.a $$10 = new ht.a();

                           label45:
                           for (ht $$11 : ht.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, hx.a)).b($$5x, $$11, $$8).c()) {
                                 for (hx $$12 : hx.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(hx.a)).a(cuv.G)) {
                                       $$5.a(new bms($$11));
                                       $$4.a(new buc(new bms($$11), $$1, 0));
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
