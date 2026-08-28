import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzx {
   public static bxa<bvo> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cam.a(
         (Function<cam.b<bvo>, ? extends App<cam.c<bvo>, cap<bvo>>>)($$3 -> $$3.group($$3.c(cek.o), $$3.c(cek.m), $$3.a(cek.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dv()).a(awv.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           fbe $$8 = fbe.a($$6);
                           ji $$9 = $$6.dv();
                           ji.a $$10 = new ji.a();

                           label45:
                           for (ji $$11 : ji.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jn.a)).b($$5x, $$11, $$8).c()) {
                                 for (jn $$12 : jn.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jn.a)).a(djn.J)) {
                                       $$5.a(new bxc($$11));
                                       $$4.a(new cen(new bxc($$11), $$1, 0));
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
