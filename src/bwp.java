import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bwp {
   private static final int a = 60;

   public static btt<bsi> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bxf.a(
         (Function<bxf.b<bsi>, ? extends App<bxf.c<bsi>, bxi<bsi>>>)($$3 -> $$3.group($$3.c(cbd.o), $$3.c(cbd.m), $$3.a(cbd.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dn()).a(avw.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        in $$8 = $$6.dn();
                        in.a $$9 = new in.a();
                        etu $$10 = etu.a($$6);

                        for (in $$11 : in.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dqh $$12 = $$5x.a_($$11);
                              dqh $$13 = $$5x.a_($$9.a($$11, is.a));
                              if (!$$12.a(ddg.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, is.b)) {
                                 in $$14 = $$11.i();
                                 $$5.a(new btv($$14));
                                 $$4.a(new cbg(new btv($$14), $$1, 1));
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
