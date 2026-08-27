import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsb {
   public static bri<bpp> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bpp> bri<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return buu.a((Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$4 -> {
         buu<E, ? extends buv<? extends K1, byv>> $$5 = $$2 ? $$4.a(bys.m) : $$4.c(bys.m);
         return $$4.group($$4.a(bys.n), $$5, $$4.b(bys.L), $$4.a(bys.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cfe $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dM().C_().a($$11.dm())) {
                  byv $$12 = new byv(new brs($$11, false), $$1, 0);
                  $$4x.a(new brs($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
