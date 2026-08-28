import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwr {
   public static bvy<buf> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends buf> bvy<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bzk.a((Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$4 -> {
         bzk<E, ? extends bzl<? extends K1, cdl>> $$5 = $$2 ? $$4.a(cdi.m) : $$4.c(cdi.m);
         return $$4.group($$4.a(cdi.n), $$5, $$4.b(cdi.L), $$4.a(cdi.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cjz $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dS().A_().a($$11.ds())) {
                  cdl $$12 = new cdl(new bwi($$11, false), $$1, 0);
                  $$4x.a(new bwi($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
