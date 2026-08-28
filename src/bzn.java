import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzn {
   public static byu<bxc> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bxc> byu<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return ccg.a((Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$4 -> {
         ccg<E, ? extends cch<? extends K1, cgh>> $$5 = $$2 ? $$4.a(cge.n) : $$4.c(cge.n);
         return $$4.group($$4.a(cge.o), $$5, $$4.b(cge.M), $$4.a(cge.aQ)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cnd $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().A_().a($$11.dv()) && $$9.fM()) {
                  cgh $$12 = new cgh(new bze($$11, false), $$1, 0);
                  $$4x.a(new bze($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
