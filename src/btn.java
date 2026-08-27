import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class btn {
   public static bqq<bpf> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return buc.a(
         (Function<buc.b<bpf>, ? extends App<buc.c<bpf>, buf<bpf>>>)($$3 -> $$3.group($$3.c(bya.o), $$3.c(bya.m), $$3.a(bya.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dj()).a(auj.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           epa $$8 = epa.a($$6);
                           ib $$9 = $$6.dj();
                           ib.a $$10 = new ib.a();

                           label45:
                           for (ib $$11 : ib.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, ih.a)).b($$5x, $$11, $$8).c()) {
                                 for (ih $$12 : ih.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).i() && $$5x.a_($$10.c(ih.a)).a(czh.G)) {
                                       $$5.a(new bqs($$11));
                                       $$4.a(new byd(new bqs($$11), $$1, 0));
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
