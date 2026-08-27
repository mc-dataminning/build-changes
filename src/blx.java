import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class blx {
   public static ble<bjm> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bjm> ble<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bop.a((Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$4 -> {
         bop<E, ? extends boq<? extends K1, bsq>> $$5 = $$2 ? $$4.a(bsn.m) : $$4.c(bsn.m);
         return $$4.group($$4.a(bsn.n), $$5, $$4.b(bsn.K), $$4.a(bsn.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               byt $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dL().B_().a($$11.dl())) {
                  bsq $$12 = new bsq(new blo($$11, false), $$1, 0);
                  $$4x.a(new blo($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
