import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byw {
   public static bvy<bun> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bzk.a(
         (Function<bzk.b<bun>, ? extends App<bzk.c<bun>, bzn<bun>>>)($$3 -> $$3.group($$3.c(cdi.o), $$3.c(cdi.m), $$3.a(cdi.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.ds()).a(awy.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        je $$8 = null;
                        je $$9 = null;
                        je $$10 = $$6.ds();

                        for (je $$12 : je.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dua $$13 = $$6.dS().a_($$12.d());
                              dua $$14 = $$6.dS().a_($$12);
                              if ($$14.a(dgx.G)) {
                                 if ($$13.l()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dq(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bwa($$8));
                           $$4.a(new cdl(new bwa($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
