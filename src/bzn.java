import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzn {
   public static bwp<bvd> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cab.a(
         (Function<cab.b<bvd>, ? extends App<cab.c<bvd>, cae<bvd>>>)($$3 -> $$3.group($$3.c(cdz.o), $$3.c(cdz.m), $$3.a(cdz.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if ($$5x.b_($$6.dx()).a(axf.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 20L + 2L);
                        return true;
                     } else {
                        jg $$8 = null;
                        jg $$9 = null;
                        jg $$10 = $$6.dx();

                        for (jg $$12 : jg.a($$10, $$0, $$0, $$0)) {
                           if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                              dvd $$13 = $$6.dX().a_($$12.d());
                              dvd $$14 = $$6.dX().a_($$12);
                              if ($$14.a(dia.G)) {
                                 if ($$13.l()) {
                                    $$8 = $$12.j();
                                    break;
                                 }

                                 if ($$9 == null && !$$12.a($$6.dv(), 1.5)) {
                                    $$9 = $$12.j();
                                 }
                              }
                           }
                        }

                        if ($$8 == null) {
                           $$8 = $$9;
                        }

                        if ($$8 != null) {
                           $$5.a(new bwr($$8));
                           $$4.a(new cec(new bwr($$8), $$1, 0));
                        }

                        $$2.setValue($$7 + 40L);
                        return true;
                     }
                  }))
      );
   }
}
