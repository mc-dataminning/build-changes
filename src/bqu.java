import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqu {
   public static bqb<boi> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends boi> bqb<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return btn.a((Function<btn.b<E>, ? extends App<btn.c<E>, btq<E>>>)($$4 -> {
         btn<E, ? extends bto<? extends K1, bxo>> $$5 = $$2 ? $$4.a(bxl.m) : $$4.c(bxl.m);
         return $$4.group($$4.a(bxl.n), $$5, $$4.b(bxl.L), $$4.a(bxl.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cdw $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dM().D_().a($$11.dm())) {
                  bxo $$12 = new bxo(new bql($$11, false), $$1, 0);
                  $$4x.a(new bql($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
