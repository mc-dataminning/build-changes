import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cat {
   public static bxv<bwj> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cbh.a(
         (Function<cbh.b<bwj>, ? extends App<cbh.c<bwj>, cbk<bwj>>>)($$3 -> $$3.group($$3.c(cff.o), $$3.c(cff.m), $$3.a(cff.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dv()).a(aya.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        jh $$8 = null;
                        jh $$9 = null;
                        jh $$10 = $$6.dv();

                        for (jh $$12 : jh.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dxn $$13 = $$6.dV().a_($$12.d());
                              dxn $$14 = $$6.dV().a_($$12);
                              if ($$14.a(dkg.J)) {
                                 if ($$13.l()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dt(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bxx($$8));
                           $$4.a(new cfi(new bxx($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
