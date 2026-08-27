import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bko {
   public static bhs<bgi> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bld.a(
         (Function<bld.b<bgi>, ? extends App<bld.c<bgi>, blg<bgi>>>)($$3 -> $$3.group($$3.c(bpb.o), $$3.c(bpb.m), $$3.a(bpb.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.di()).a(anb.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           een $$8 = een.a($$6);
                           gu $$9 = $$6.di();
                           gu.a $$10 = new gu.a();

                           label45:
                           for (gu $$11 : gu.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).b()
                                 && !$$5x.a_($$10.a($$11, ha.a)).b($$5x, $$11, $$8).b()) {
                                 for (ha $$12 : ha.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ha.a)).a(cpo.G)) {
                                       $$5.a(new bhu($$11));
                                       $$4.a(new bpe(new bhu($$11), $$1, 0));
                                       break label45;
                                    }
                                 }
                              }
                           }

                           $$2.setValue($$7 + 40L);
                           return true;
                        }
                     }
               ))
      );
   }
}
