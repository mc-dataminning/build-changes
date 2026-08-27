import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bva {
   public static buh<bso> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bso> buh<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bxt.a((Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$4 -> {
         bxt<E, ? extends bxu<? extends K1, cbu>> $$5 = $$2 ? $$4.a(cbr.m) : $$4.c(cbr.m);
         return $$4.group($$4.a(cbr.n), $$5, $$4.b(cbr.L), $$4.a(cbr.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cig $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dU().D_().a($$11.du())) {
                  cbu $$12 = new cbu(new bur($$11, false), $$1, 0);
                  $$4x.a(new bur($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
