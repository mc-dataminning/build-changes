import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bww {
   public static bwd<buk> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends buk> bwd<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bzp.a((Function<bzp.b<E>, ? extends App<bzp.c<E>, bzs<E>>>)($$4 -> {
         bzp<E, ? extends bzq<? extends K1, cdq>> $$5 = $$2 ? $$4.a(cdn.m) : $$4.c(cdn.m);
         return $$4.group($$4.a(cdn.n), $$5, $$4.b(cdn.L), $$4.a(cdn.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cke $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dS().A_().a($$11.ds())) {
                  cdq $$12 = new cdq(new bwn($$11, false), $$1, 0);
                  $$4x.a(new bwn($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
