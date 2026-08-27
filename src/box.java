import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class box {
   public static bmb<bks> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bpm.a(
         (Function<bpm.b<bks>, ? extends App<bpm.c<bks>, bpp<bks>>>)($$3 -> $$3.group($$3.c(btk.o), $$3.c(btk.m), $$3.a(btk.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dl()).a(aqx.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           eik $$8 = eik.a($$6);
                           ht $$9 = $$6.dl();
                           ht.a $$10 = new ht.a();

                           label45:
                           for (ht $$11 : ht.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, hx.a)).b($$5x, $$11, $$8).c()) {
                                 for (hx $$12 : hx.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(hx.a)).a(cuc.G)) {
                                       $$5.a(new bmd($$11));
                                       $$4.a(new btn(new bmd($$11), $$1, 0));
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
