import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzz {
   public static bxc<bvq> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cao.a(
         (Function<cao.b<bvq>, ? extends App<cao.c<bvq>, car<bvq>>>)($$3 -> $$3.group($$3.c(cem.o), $$3.c(cem.m), $$3.a(cem.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dv()).a(awv.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           fbg $$8 = fbg.a($$6);
                           ji $$9 = $$6.dv();
                           ji.a $$10 = new ji.a();

                           label45:
                           for (ji $$11 : ji.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jn.a)).b($$5x, $$11, $$8).c()) {
                                 for (jn $$12 : jn.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jn.a)).a(djp.J)) {
                                       $$5.a(new bxe($$11));
                                       $$4.a(new cep(new bxe($$11), $$1, 0));
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
