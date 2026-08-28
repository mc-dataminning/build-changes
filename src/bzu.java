import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzu {
   public static bzb<bxj> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bxj> bzb<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return ccn.a((Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$4 -> {
         ccn<E, ? extends cco<? extends K1, cgo>> $$5 = $$2 ? $$4.a(cgl.n) : $$4.c(cgl.n);
         return $$4.group($$4.a(cgl.o), $$5, $$4.b(cgl.M), $$4.a(cgl.aQ)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cno $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dU().A_().a($$11.du()) && $$9.fM()) {
                  cgo $$12 = new cgo(new bzl($$11, false), $$1, 0);
                  $$4x.a(new bzl($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
