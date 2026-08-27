import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqt {
   public static <T extends bog> bpx<bog> a(bnu<? extends T> $$0, int $$1, bxh<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bog, T extends bog> bpx<E> a(bnu<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bxh<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bog> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return btj.a(
         (Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bxh.n), $$6x.c(bxh.m), $$6x.b(bxh.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bxj $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bog> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((bno)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bqh($$5xxxx, true));
                           $$8x.a(new bxk(new bqh($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
