import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbf {
   private static final int a = 60;

   public static byj<bwz> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cbv.a(
         (Function<cbv.b<bwz>, ? extends App<cbv.c<bwz>, cby<bwz>>>)($$3 -> $$3.group($$3.c(cft.p), $$3.c(cft.n), $$3.a(cft.o))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dv()).a(axf.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        jj $$8 = $$6.dv();
                        jj.a $$9 = new jj.a();
                        fcz $$10 = fcz.a($$6);

                        for (jj $$11 : jj.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dym $$12 = $$5x.a_($$11);
                              dym $$13 = $$5x.a_($$9.a($$11, jo.a));
                              if (!$$12.a(dkw.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jo.b)) {
                                 jj $$14 = $$11.j();
                                 $$5.a(new byl($$14));
                                 $$4.a(new cfw(new byl($$14), $$1, 1));
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
