import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class cah {
   public static bzo<bxw> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bxw> bzo<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cda.a((Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$4 -> {
         cda<E, ? extends cdb<? extends K1, chb>> $$5 = $$2 ? $$4.a(cgy.n) : $$4.c(cgy.n);
         return $$4.group($$4.a(cgy.o), $$5, $$4.b(cgy.M), $$4.a(cgy.aQ)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               coe $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().E_().a($$11.dv()) && $$9.fN()) {
                  chb $$12 = new chb(new bzy($$11, false), $$1, 0);
                  $$4x.a(new bzy($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
