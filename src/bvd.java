import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvd {
   public static buk<bsq> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bsq> buk<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bxw.a((Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>>)($$4 -> {
         bxw<E, ? extends bxx<? extends K1, cbx>> $$5 = $$2 ? $$4.a(cbu.m) : $$4.c(cbu.m);
         return $$4.group($$4.a(cbu.n), $$5, $$4.b(cbu.L), $$4.a(cbu.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cii $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dP().C_().a($$11.dp())) {
                  cbx $$12 = new cbx(new buu($$11, false), $$1, 0);
                  $$4x.a(new buu($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
