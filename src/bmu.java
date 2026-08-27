import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmu {
   public static bmb<bkj> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bkj> bmb<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bpm.a((Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$4 -> {
         bpm<E, ? extends bpn<? extends K1, btn>> $$5 = $$2 ? $$4.a(btk.m) : $$4.c(btk.m);
         return $$4.group($$4.a(btk.n), $$5, $$4.b(btk.K), $$4.a(btk.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               bzq $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dL().C_().a($$11.dl())) {
                  btn $$12 = new btn(new bml($$11, false), $$1, 0);
                  $$4x.a(new bml($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
