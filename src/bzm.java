import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzm {
   public static bwp<bvd> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cab.a(
         (Function<cab.b<bvd>, ? extends App<cab.c<bvd>, cae<bvd>>>)($$3 -> $$3.group($$3.c(cdz.o), $$3.c(cdz.m), $$3.a(cdz.n))
               .apply(
                  $$3,
                  ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                        if ($$5x.b_($$6.dx()).a(axf.a)) {
                           return false;
                        } else if ($$7 < $$2.getValue()) {
                           $$2.setValue($$7 + 40L);
                           return true;
                        } else {
                           ezm $$8 = ezm.a($$6);
                           jg $$9 = $$6.dx();
                           jg.a $$10 = new jg.a();

                           label45:
                           for (jg $$11 : jg.a($$9, $$0, $$0, $$0)) {
                              if (($$11.u() != $$9.u() || $$11.w() != $$9.w())
                                 && $$5x.a_($$11).b($$5x, $$11, $$8).c()
                                 && !$$5x.a_($$10.a($$11, jl.a)).b($$5x, $$11, $$8).c()) {
                                 for (jl $$12 : jl.c.a) {
                                    $$10.a($$11, $$12);
                                    if ($$5x.a_($$10).l() && $$5x.a_($$10.c(jl.a)).a(dia.G)) {
                                       $$5.a(new bwr($$11));
                                       $$4.a(new cec(new bwr($$11), $$1, 0));
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
