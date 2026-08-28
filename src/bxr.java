import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxr {
   public static bwy<bve> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bve> bwy<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cak.a((Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$4 -> {
         cak<E, ? extends cal<? extends K1, cel>> $$5 = $$2 ? $$4.a(cei.m) : $$4.c(cei.m);
         return $$4.group($$4.a(cei.n), $$5, $$4.b(cei.L), $$4.a(cei.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               ckz $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dY().C_().a($$11.dy()) && $$9.fQ()) {
                  cel $$12 = new cel(new bxi($$11, false), $$1, 0);
                  $$4x.a(new bxi($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
