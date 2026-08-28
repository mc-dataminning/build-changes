import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cct {
   private static final int a = 60;

   public static bzx<byn> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cdj.a(
         (Function<cdj.b<byn>, ? extends App<cdj.c<byn>, cdm<byn>>>)($$3 -> $$3.group($$3.c(chh.p), $$3.c(chh.n), $$3.a(chh.o))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dv()).a(axs.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        iw $$8 = $$6.dv();
                        iw.a $$9 = new iw.a();
                        fgh $$10 = fgh.a($$6);

                        for (iw $$11 : iw.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              ebq $$12 = $$5x.a_($$11);
                              ebq $$13 = $$5x.a_($$9.a($$11, jc.a));
                              if (!$$12.a(dnq.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jc.b)) {
                                 iw $$14 = $$11.j();
                                 $$5.a(new bzz($$14));
                                 $$4.a(new chk(new bzz($$14), $$1, 1));
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
