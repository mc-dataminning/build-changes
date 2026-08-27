import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bkn {
   private static final int a = 60;

   public static bhs<bgi> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bld.a(
         (Function<bld.b<bgi>, ? extends App<bld.c<bgi>, blg<bgi>>>)($$3 -> $$3.group($$3.c(bpb.o), $$3.c(bpb.m), $$3.a(bpb.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.di()).a(anb.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        gu $$8 = $$6.di();
                        gu.a $$9 = new gu.a();
                        een $$10 = een.a($$6);

                        for (gu $$11 : gu.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dcb $$12 = $$5x.a_($$11);
                              dcb $$13 = $$5x.a_($$9.a($$11, ha.a));
                              if (!$$12.a(cpo.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).b() && $$13.d($$5x, $$9, ha.b)) {
                                 gu $$14 = $$11.i();
                                 $$5.a(new bhu($$14));
                                 $$4.a(new bpe(new bhu($$14), $$1, 1));
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
