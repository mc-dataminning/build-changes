import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bpn {
   public static bmq<blh> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bqb.a(
         (Function<bqb.b<blh>, ? extends App<bqb.c<blh>, bqe<blh>>>)($$3 -> $$3.group($$3.c(btz.o), $$3.c(btz.m), $$3.a(btz.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dl()).a(arh.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ht $$8 = null;
                        ht $$9 = null;
                        ht $$10 = $$6.dl();

                        for (ht $$12 : ht.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dgw $$13 = $$6.dL().a_($$12.c());
                              dgw $$14 = $$6.dL().a_($$12);
                              if ($$14.a(cuv.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dj(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bms($$8));
                           $$4.a(new buc(new bms($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
