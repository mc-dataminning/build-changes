import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwz {
   public static bwg<bun> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bun> bwg<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bzs.a((Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$4 -> {
         bzs<E, ? extends bzt<? extends K1, cdt>> $$5 = $$2 ? $$4.a(cdq.m) : $$4.c(cdq.m);
         return $$4.group($$4.a(cdq.n), $$5, $$4.b(cdq.L), $$4.a(cdq.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               ckh $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dS().B_().a($$11.ds()) && $$9.fJ()) {
                  cdt $$12 = new cdt(new bwq($$11, false), $$1, 0);
                  $$4x.a(new bwq($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
