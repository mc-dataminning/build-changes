import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxn {
   public static bwu<bva> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bva> bwu<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cag.a((Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$4 -> {
         cag<E, ? extends cah<? extends K1, ceh>> $$5 = $$2 ? $$4.a(cee.m) : $$4.c(cee.m);
         return $$4.group($$4.a(cee.n), $$5, $$4.b(cee.L), $$4.a(cee.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               ckv $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dX().C_().a($$11.dx()) && $$9.fP()) {
                  ceh $$12 = new ceh(new bxe($$11, false), $$1, 0);
                  $$4x.a(new bxe($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
