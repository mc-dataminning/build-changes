import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class blt {
   public static bla<bji> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bji> bla<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bol.a((Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$4 -> {
         bol<E, ? extends bom<? extends K1, bsm>> $$5 = $$2 ? $$4.a(bsj.m) : $$4.c(bsj.m);
         return $$4.group($$4.a(bsj.n), $$5, $$4.b(bsj.K), $$4.a(bsj.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               byp $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dL().B_().a($$11.dl())) {
                  bsm $$12 = new bsm(new blk($$11, false), $$1, 0);
                  $$4x.a(new blk($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
