import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnj {
   public static bmq<bky> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bky> bmq<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bqb.a((Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$4 -> {
         bqb<E, ? extends bqc<? extends K1, buc>> $$5 = $$2 ? $$4.a(btz.m) : $$4.c(btz.m);
         return $$4.group($$4.a(btz.n), $$5, $$4.b(btz.K), $$4.a(btz.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               caf $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dL().C_().a($$11.dl())) {
                  buc $$12 = new buc(new bna($$11, false), $$1, 0);
                  $$4x.a(new bna($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
