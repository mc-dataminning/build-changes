import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bud {
   private static final int a = 60;

   public static brh<bpw> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return but.a(
         (Function<but.b<bpw>, ? extends App<but.c<bpw>, buw<bpw>>>)($$3 -> $$3.group($$3.c(byr.o), $$3.c(byr.m), $$3.a(byr.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dm()).a(aus.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ib $$8 = $$6.dm();
                        ib.a $$9 = new ib.a();
                        epw $$10 = epw.a($$6);

                        for (ib $$11 : ib.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dmz $$12 = $$5x.a_($$11);
                              dmz $$13 = $$5x.a_($$9.a($$11, ih.a));
                              if (!$$12.a(dac.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ih.b)) {
                                 ib $$14 = $$11.i();
                                 $$5.a(new brj($$14));
                                 $$4.a(new byu(new brj($$14), $$1, 1));
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
