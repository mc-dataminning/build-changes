import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzy {
   private static final int a = 60;

   public static bxc<bvq> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cao.a(
         (Function<cao.b<bvq>, ? extends App<cao.c<bvq>, car<bvq>>>)($$3 -> $$3.group($$3.c(cem.o), $$3.c(cem.m), $$3.a(cem.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dv()).a(awv.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        ji $$8 = $$6.dv();
                        ji.a $$9 = new ji.a();
                        fbg $$10 = fbg.a($$6);

                        for (ji $$11 : ji.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dwy $$12 = $$5x.a_($$11);
                              dwy $$13 = $$5x.a_($$9.a($$11, jn.a));
                              if (!$$12.a(djp.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jn.b)) {
                                 ji $$14 = $$11.j();
                                 $$5.a(new bxe($$14));
                                 $$4.a(new cep(new bxe($$14), $$1, 1));
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
