import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cav {
   private static final int a = 60;

   public static bxz<bwn> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cbl.a(
         (Function<cbl.b<bwn>, ? extends App<cbl.c<bwn>, cbo<bwn>>>)($$3 -> $$3.group($$3.c(cfj.o), $$3.c(cfj.m), $$3.a(cfj.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dw()).a(aya.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        jh $$8 = $$6.dw();
                        jh.a $$9 = new jh.a();
                        fcc $$10 = fcc.a($$6);

                        for (jh $$11 : jh.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dxu $$12 = $$5x.a_($$11);
                              dxu $$13 = $$5x.a_($$9.a($$11, jm.a));
                              if (!$$12.a(dkn.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jm.b)) {
                                 jh $$14 = $$11.j();
                                 $$5.a(new byb($$14));
                                 $$4.a(new cfm(new byb($$14), $$1, 1));
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
