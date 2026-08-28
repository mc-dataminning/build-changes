import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxi {
   public static bwp<buv> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends buv> bwp<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cab.a((Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$4 -> {
         cab<E, ? extends cac<? extends K1, cec>> $$5 = $$2 ? $$4.a(cdz.m) : $$4.c(cdz.m);
         return $$4.group($$4.a(cdz.n), $$5, $$4.b(cdz.L), $$4.a(cdz.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               ckq $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dX().C_().a($$11.dx()) && $$9.fP()) {
                  cec $$12 = new cec(new bwz($$11, false), $$1, 0);
                  $$4x.a(new bwz($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
