import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvx {
   public static bve<btk> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends btk> bve<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return byq.a((Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$4 -> {
         byq<E, ? extends byr<? extends K1, ccr>> $$5 = $$2 ? $$4.a(cco.m) : $$4.c(cco.m);
         return $$4.group($$4.a(cco.n), $$5, $$4.b(cco.L), $$4.a(cco.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cjc $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dP().C_().a($$11.dp())) {
                  ccr $$12 = new ccr(new bvo($$11, false), $$1, 0);
                  $$4x.a(new bvo($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
