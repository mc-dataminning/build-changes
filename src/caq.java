import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class caq {
   public static bxs<bwg> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cbe.a(
         (Function<cbe.b<bwg>, ? extends App<cbe.c<bwg>, cbh<bwg>>>)($$3 -> $$3.group($$3.c(cfc.o), $$3.c(cfc.m), $$3.a(cfc.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.du()).a(awv.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ji $$8 = null;
                        ji $$9 = null;
                        ji $$10 = $$6.du();

                        for (ji $$12 : ji.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dxq $$13 = $$6.dU().a_($$12.d());
                              dxq $$14 = $$6.dU().a_($$12);
                              if ($$14.a(dkg.J)) {
                                 if ($$13.l()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.ds(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bxu($$8));
                           $$4.a(new cff(new bxu($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
