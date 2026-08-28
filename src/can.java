import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class can {
   private static final int a = 60;

   public static bxr<bwf> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cbd.a(
         (Function<cbd.b<bwf>, ? extends App<cbd.c<bwf>, cbg<bwf>>>)($$3 -> $$3.group($$3.c(cfb.o), $$3.c(cfb.m), $$3.a(cfb.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dw()).a(axq.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        jh $$8 = $$6.dw();
                        jh.a $$9 = new jh.a();
                        fbw $$10 = fbw.a($$6);

                        for (jh $$11 : jh.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dxo $$12 = $$5x.a_($$11);
                              dxo $$13 = $$5x.a_($$9.a($$11, jm.a));
                              if (!$$12.a(dkf.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jm.b)) {
                                 jh $$14 = $$11.j();
                                 $$5.a(new bxt($$14));
                                 $$4.a(new cfe(new bxt($$14), $$1, 1));
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
