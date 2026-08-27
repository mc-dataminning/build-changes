import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bvi {
   private static final int a = 60;

   public static bsm<brb> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bvy.a(
         (Function<bvy.b<brb>, ? extends App<bvy.c<brb>, bwb<brb>>>)($$3 -> $$3.group($$3.c(bzw.o), $$3.c(bzw.m), $$3.a(bzw.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dm()).a(avj.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        id $$8 = $$6.dm();
                        id.a $$9 = new id.a();
                        eso $$10 = eso.a($$6);

                        for (id $$11 : id.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dpi $$12 = $$5x.a_($$11);
                              dpi $$13 = $$5x.a_($$9.a($$11, ij.a));
                              if (!$$12.a(dcj.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.d($$5x, $$9, ij.b)) {
                                 id $$14 = $$11.i();
                                 $$5.a(new bso($$14));
                                 $$4.a(new bzz(new bso($$14), $$1, 1));
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
