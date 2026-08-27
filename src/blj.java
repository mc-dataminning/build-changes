import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class blj {
   public static bkq<biy> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends biy> bkq<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bob.a((Function<bob.b<E>, ? extends App<bob.c<E>, boe<E>>>)($$4 -> {
         bob<E, ? extends boc<? extends K1, bsc>> $$5 = $$2 ? $$4.a(brz.m) : $$4.c(brz.m);
         return $$4.group($$4.a(brz.n), $$5, $$4.b(brz.K), $$4.a(brz.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               byf $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dK().w_().a($$11.dk())) {
                  bsc $$12 = new bsc(new bla($$11, false), $$1, 0);
                  $$4x.a(new bla($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
