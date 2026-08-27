import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class brj {
   public static bqq<box> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends box> bqq<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return buc.a((Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$4 -> {
         buc<E, ? extends bud<? extends K1, byd>> $$5 = $$2 ? $$4.a(bya.m) : $$4.c(bya.m);
         return $$4.group($$4.a(bya.n), $$5, $$4.b(bya.L), $$4.a(bya.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cel $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dJ().D_().a($$11.dj())) {
                  byd $$12 = new byd(new bra($$11, false), $$1, 0);
                  $$4x.a(new bra($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
