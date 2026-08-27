import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxg {
   private static final int a = 60;

   public static buk<bsz> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bxw.a(
         (Function<bxw.b<bsz>, ? extends App<bxw.c<bsz>, bxz<bsz>>>)($$3 -> $$3.group($$3.c(cbu.o), $$3.c(cbu.m), $$3.a(cbu.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dp()).a(awc.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        io $$8 = $$6.dp();
                        io.a $$9 = new io.a();
                        eur $$10 = eur.a($$6);

                        for (io $$11 : io.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              drd $$12 = $$5x.a_($$11);
                              drd $$13 = $$5x.a_($$9.a($$11, it.a));
                              if (!$$12.a(dec.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, it.b)) {
                                 io $$14 = $$11.i();
                                 $$5.a(new bum($$14));
                                 $$4.a(new cbx(new bum($$14), $$1, 1));
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
