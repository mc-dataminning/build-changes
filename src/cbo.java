import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbo {
   public static byr<bxh> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return ccd.a(
         (Function<ccd.b<bxh>, ? extends App<ccd.c<bxh>, ccg<bxh>>>)($$3 -> $$3.group($$3.c(cgb.p), $$3.c(cgb.n), $$3.a(cgb.o))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dv()).a(axf.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           feb $$8 = feb.a($$6);
                           iu $$9 = $$6.dv();
                           iu.a $$10 = new iu.a();

                           label45:
                           for (iu $$11 : iu.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ja.a)).b($$5x, $$11, $$8).c()) {
                                 for (ja $$12 : ja.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(ja.a)).a(dlw.J)) {
                                       $$5.a(new byt($$11));
                                       $$4.a(new cge(new byt($$11), $$1, 0));
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
