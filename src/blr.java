import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class blr {
   public static bky<bjg> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bjg> bky<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return boj.a((Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$4 -> {
         boj<E, ? extends bok<? extends K1, bsk>> $$5 = $$2 ? $$4.a(bsh.m) : $$4.c(bsh.m);
         return $$4.group($$4.a(bsh.n), $$5, $$4.b(bsh.K), $$4.a(bsh.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               byn $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dL().B_().a($$11.dl())) {
                  bsk $$12 = new bsk(new bli($$11, false), $$1, 0);
                  $$4x.a(new bli($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
