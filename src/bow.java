import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bow {
   private static final int a = 60;

   public static bmb<bks> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bpm.a(
         (Function<bpm.b<bks>, ? extends App<bpm.c<bks>, bpp<bks>>>)($$3 -> $$3.group($$3.c(btk.o), $$3.c(btk.m), $$3.a(btk.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dl()).a(aqx.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ht $$8 = $$6.dl();
                        ht.a $$9 = new ht.a();
                        eik $$10 = eik.a($$6);

                        for (ht $$11 : ht.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dgb $$12 = $$5x.a_($$11);
                              dgb $$13 = $$5x.a_($$9.a($$11, hx.a));
                              if (!$$12.a(cuc.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, hx.b)) {
                                 ht $$14 = $$11.i();
                                 $$5.a(new bmd($$14));
                                 $$4.a(new btn(new bmd($$14), $$1, 1));
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
