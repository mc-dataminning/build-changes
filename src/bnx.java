import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bnx {
   public static bla<bjr> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return bol.a(
         (Function<bol.b<bjr>, ? extends App<bol.c<bjr>, boo<bjr>>>)($$3 -> $$3.group($$3.c(bsj.o), $$3.c(bsj.m), $$3.a(bsj.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dl()).a(apz.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        gw $$8 = null;
                        gw $$9 = null;
                        gw $$10 = $$6.dl();

                        for (gw $$12 : gw.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dfl $$13 = $$6.dL().a_($$12.c());
                              dfl $$14 = $$6.dL().a_($$12);
                              if ($$14.a(csy.G)) {
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
                           $$5.a(new blc($$8));
                           $$4.a(new bsm(new blc($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
