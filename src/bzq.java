import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzq {
   private static final int a = 60;

   public static bwu<bvi> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cag.a(
         (Function<cag.b<bvi>, ? extends App<cag.c<bvi>, caj<bvi>>>)($$3 -> $$3.group($$3.c(cee.o), $$3.c(cee.m), $$3.a(cee.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dx()).a(axg.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        jh $$8 = $$6.dx();
                        jh.a $$9 = new jh.a();
                        ezs $$10 = ezs.a($$6);

                        for (jh $$11 : jh.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dvj $$12 = $$5x.a_($$11);
                              dvj $$13 = $$5x.a_($$9.a($$11, jm.a));
                              if (!$$12.a(dig.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jm.b)) {
                                 jh $$14 = $$11.j();
                                 $$5.a(new bww($$14));
                                 $$4.a(new ceh(new bww($$14), $$1, 1));
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
