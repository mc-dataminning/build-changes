import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxh {
   public static buk<bsz> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bxw.a(
         (Function<bxw.b<bsz>, ? extends App<bxw.c<bsz>, bxz<bsz>>>)($$3 -> $$3.group($$3.c(cbu.o), $$3.c(cbu.m), $$3.a(cbu.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dp()).a(awc.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           eur $$8 = eur.a($$6);
                           io $$9 = $$6.dp();
                           io.a $$10 = new io.a();

                           label45:
                           for (io $$11 : io.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, it.a)).b($$5x, $$11, $$8).c()) {
                                 for (it $$12 : it.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(it.a)).a(dec.G)) {
                                       $$5.a(new bum($$11));
                                       $$4.a(new cbx(new bum($$11), $$1, 0));
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
