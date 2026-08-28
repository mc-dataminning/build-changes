import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvz {
   public static bvg<btl> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends btl> bvg<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bys.a((Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$4 -> {
         bys<E, ? extends byt<? extends K1, cct>> $$5 = $$2 ? $$4.a(ccq.m) : $$4.c(ccq.m);
         return $$4.group($$4.a(ccq.n), $$5, $$4.b(ccq.L), $$4.a(ccq.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cjf $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dQ().C_().a($$11.dq())) {
                  cct $$12 = new cct(new bvq($$11, false), $$1, 0);
                  $$4x.a(new bvq($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
