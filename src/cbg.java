import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbg {
   public static byj<bwz> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cbv.a(
         (Function<cbv.b<bwz>, ? extends App<cbv.c<bwz>, cby<bwz>>>)($$3 -> $$3.group($$3.c(cft.p), $$3.c(cft.n), $$3.a(cft.o))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dv()).a(axf.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           fcz $$8 = fcz.a($$6);
                           jj $$9 = $$6.dv();
                           jj.a $$10 = new jj.a();

                           label45:
                           for (jj $$11 : jj.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jo.a)).b($$5x, $$11, $$8).c()) {
                                 for (jo $$12 : jo.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jo.a)).a(dkw.J)) {
                                       $$5.a(new byl($$11));
                                       $$4.a(new cfw(new byl($$11), $$1, 0));
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
