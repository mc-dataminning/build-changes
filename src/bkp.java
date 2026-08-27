import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bkp {
   public static bhs<bgi> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bld.a(
         (Function<bld.b<bgi>, ? extends App<bld.c<bgi>, blg<bgi>>>)($$3 -> $$3.group($$3.c(bpb.o), $$3.c(bpb.m), $$3.a(bpb.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.di()).a(anb.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        gu $$8 = null;
                        gu $$9 = null;
                        gu $$10 = $$6.di();

                        for (gu $$12 : gu.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dcb $$13 = $$6.dI().a_($$12.c());
                              dcb $$14 = $$6.dI().a_($$12);
                              if ($$14.a(cpo.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dg(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bhu($$8));
                           $$4.a(new bpe(new bhu($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
