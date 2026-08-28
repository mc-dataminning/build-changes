import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxt {
   public static bxa<bvg> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bvg> bxa<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cam.a((Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$4 -> {
         cam<E, ? extends can<? extends K1, cen>> $$5 = $$2 ? $$4.a(cek.m) : $$4.c(cek.m);
         return $$4.group($$4.a(cek.n), $$5, $$4.b(cek.L), $$4.a(cek.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               clb $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().F_().a($$11.dv()) && $$9.fN()) {
                  cen $$12 = new cen(new bxk($$11, false), $$1, 0);
                  $$4x.a(new bxk($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
