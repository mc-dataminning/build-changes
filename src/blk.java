import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class blk {
   public static bkr<biy> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends biy> bkr<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return boc.a((Function<boc.b<E>, ? extends App<boc.c<E>, bof<E>>>)($$4 -> {
         boc<E, ? extends bod<? extends K1, bsd>> $$5 = $$2 ? $$4.a(bsa.m) : $$4.c(bsa.m);
         return $$4.group($$4.a(bsa.n), $$5, $$4.b(bsa.K), $$4.a(bsa.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               byg $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dK().w_().a($$11.dk())) {
                  bsd $$12 = new bsd(new blb($$11, false), $$1, 0);
                  $$4x.a(new blb($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
