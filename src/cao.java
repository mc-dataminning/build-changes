import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cao {
   private static final int a = 60;

   public static bxs<bwg> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cbe.a(
         (Function<cbe.b<bwg>, ? extends App<cbe.c<bwg>, cbh<bwg>>>)($$3 -> $$3.group($$3.c(cfc.o), $$3.c(cfc.m), $$3.a(cfc.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.du()).a(awv.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ji $$8 = $$6.du();
                        ji.a $$9 = new ji.a();
                        fcc $$10 = fcc.a($$6);

                        for (ji $$11 : ji.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dxq $$12 = $$5x.a_($$11);
                              dxq $$13 = $$5x.a_($$9.a($$11, jn.a));
                              if (!$$12.a(dkg.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jn.b)) {
                                 ji $$14 = $$11.j();
                                 $$5.a(new bxu($$14));
                                 $$4.a(new cff(new bxu($$14), $$1, 1));
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
