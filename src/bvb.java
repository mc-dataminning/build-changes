import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvb {
   public static bui<bso> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bso> bui<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bxu.a((Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$4 -> {
         bxu<E, ? extends bxv<? extends K1, cbv>> $$5 = $$2 ? $$4.a(cbs.m) : $$4.c(cbs.m);
         return $$4.group($$4.a(cbs.n), $$5, $$4.b(cbs.L), $$4.a(cbs.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cig $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dP().C_().a($$11.dp())) {
                  cbv $$12 = new cbv(new bus($$11, false), $$1, 0);
                  $$4x.a(new bus($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
