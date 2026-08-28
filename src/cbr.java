import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbr {
   public static byu<bxk> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return ccg.a(
         (Function<ccg.b<bxk>, ? extends App<ccg.c<bxk>, ccj<bxk>>>)($$3 -> $$3.group($$3.c(cge.p), $$3.c(cge.n), $$3.a(cge.o))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dv()).a(axh.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           fen $$8 = fen.a($$6);
                           iu $$9 = $$6.dv();
                           iu.a $$10 = new iu.a();

                           label45:
                           for (iu $$11 : iu.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ja.a)).b($$5x, $$11, $$8).c()) {
                                 for (ja $$12 : ja.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(ja.a)).a(dmc.J)) {
                                       $$5.a(new byw($$11));
                                       $$4.a(new cgh(new byw($$11), $$1, 0));
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
