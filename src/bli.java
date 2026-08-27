import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bli {
   public static bkp<biw> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends biw> bkp<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return boa.a((Function<boa.b<E>, ? extends App<boa.c<E>, bod<E>>>)($$4 -> {
         boa<E, ? extends bob<? extends K1, bsb>> $$5 = $$2 ? $$4.a(bry.m) : $$4.c(bry.m);
         return $$4.group($$4.a(bry.n), $$5, $$4.b(bry.K), $$4.a(bry.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               bye $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dK().w_().a($$11.dk())) {
                  bsb $$12 = new bsb(new bkz($$11, false), $$1, 0);
                  $$4x.a(new bkz($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
