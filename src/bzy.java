import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzy {
   public static bxa<bvo> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cam.a(
         (Function<cam.b<bvo>, ? extends App<cam.c<bvo>, cap<bvo>>>)($$3 -> $$3.group($$3.c(cek.o), $$3.c(cek.m), $$3.a(cek.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dv()).a(awv.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        ji $$8 = null;
                        ji $$9 = null;
                        ji $$10 = $$6.dv();

                        for (ji $$12 : ji.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dww $$13 = $$6.dV().a_($$12.d());
                              dww $$14 = $$6.dV().a_($$12);
                              if ($$14.a(djn.J)) {
                                 if ($$13.l()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dt(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bxc($$8));
                           $$4.a(new cen(new bxc($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
