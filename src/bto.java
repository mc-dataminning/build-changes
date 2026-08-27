import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bto {
   public static bqq<bpf> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return buc.a(
         (Function<buc.b<bpf>, ? extends App<buc.c<bpf>, buf<bpf>>>)($$3 -> $$3.group($$3.c(bya.o), $$3.c(bya.m), $$3.a(bya.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dj()).a(auj.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ib $$8 = null;
                        ib $$9 = null;
                        ib $$10 = $$6.dj();

                        for (ib $$12 : ib.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dme $$13 = $$6.dJ().a_($$12.c());
                              dme $$14 = $$6.dJ().a_($$12);
                              if ($$14.a(czh.G)) {
                                 if ($$13.i()) {
                                    $$8 = $$12.i();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dh(), 1.5)) {
                                    $$9 = $$12.i();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bqs($$8));
                           $$4.a(new byd(new bqs($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
