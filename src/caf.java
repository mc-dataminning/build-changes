import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class caf {
   public static bzm<bxu> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bxu> bzm<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return ccy.a((Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$4 -> {
         ccy<E, ? extends ccz<? extends K1, cgz>> $$5 = $$2 ? $$4.a(cgw.n) : $$4.c(cgw.n);
         return $$4.group($$4.a(cgw.o), $$5, $$4.b(cgw.M), $$4.a(cgw.aQ)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               coc $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().E_().a($$11.dv()) && $$9.fN()) {
                  cgz $$12 = new cgz(new bzw($$11, false), $$1, 0);
                  $$4x.a(new bzw($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
