import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bys {
   public static bxz<bwf> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bwf> bxz<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cbl.a((Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$4 -> {
         cbl<E, ? extends cbm<? extends K1, cfm>> $$5 = $$2 ? $$4.a(cfj.m) : $$4.c(cfj.m);
         return $$4.group($$4.a(cfj.n), $$5, $$4.b(cfj.L), $$4.a(cfj.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cma $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().F_().a($$11.dv()) && $$9.fL()) {
                  cfm $$12 = new cfm(new byj($$11, false), $$1, 0);
                  $$4x.a(new byj($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
