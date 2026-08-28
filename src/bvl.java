import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvl {
   public static bus<bsy> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bsy> bus<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bye.a((Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$4 -> {
         bye<E, ? extends byf<? extends K1, ccf>> $$5 = $$2 ? $$4.a(ccc.m) : $$4.c(ccc.m);
         return $$4.group($$4.a(ccc.n), $$5, $$4.b(ccc.L), $$4.a(ccc.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cir $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dP().C_().a($$11.dp())) {
                  ccf $$12 = new ccf(new bvc($$11, false), $$1, 0);
                  $$4x.a(new bvc($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
