import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byu {
   private static final int a = 60;

   public static bvy<bun> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bzk.a(
         (Function<bzk.b<bun>, ? extends App<bzk.c<bun>, bzn<bun>>>)($$3 -> $$3.group($$3.c(cdi.o), $$3.c(cdi.m), $$3.a(cdi.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.ds()).a(awy.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        je $$8 = $$6.ds();
                        je.a $$9 = new je.a();
                        eyj $$10 = eyj.a($$6);

                        for (je $$11 : je.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dua $$12 = $$5x.a_($$11);
                              dua $$13 = $$5x.a_($$9.a($$11, jj.a));
                              if (!$$12.a(dgx.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jj.b)) {
                                 je $$14 = $$11.j();
                                 $$5.a(new bwa($$14));
                                 $$4.a(new cdl(new bwa($$14), $$1, 1));
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
