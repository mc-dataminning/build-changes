import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class byt {
   public static bya<bwg> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bwg> bya<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cbm.a((Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$4 -> {
         cbm<E, ? extends cbn<? extends K1, cfn>> $$5 = $$2 ? $$4.a(cfk.m) : $$4.c(cfk.m);
         return $$4.group($$4.a(cfk.n), $$5, $$4.b(cfk.L), $$4.a(cfk.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cmb $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dW().F_().a($$11.dw()) && $$9.fN()) {
                  cfn $$12 = new cfn(new byk($$11, false), $$1, 0);
                  $$4x.a(new byk($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
