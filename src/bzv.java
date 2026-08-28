import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzv {
   private static final int a = 60;

   public static bwz<bvn> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cal.a(
         (Function<cal.b<bvn>, ? extends App<cal.c<bvn>, cao<bvn>>>)($$3 -> $$3.group($$3.c(cej.o), $$3.c(cej.m), $$3.a(cej.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dw()).a(awu.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ji $$8 = $$6.dw();
                        ji.a $$9 = new ji.a();
                        fbd $$10 = fbd.a($$6);

                        for (ji $$11 : ji.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dwv $$12 = $$5x.a_($$11);
                              dwv $$13 = $$5x.a_($$9.a($$11, jn.a));
                              if (!$$12.a(djm.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jn.b)) {
                                 ji $$14 = $$11.j();
                                 $$5.a(new bxb($$14));
                                 $$4.a(new cem(new bxb($$14), $$1, 1));
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
