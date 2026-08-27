import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bot {
   public static <T extends bmf> bnx<bmf> a(blt<? extends T> $$0, int $$1, bvh<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bmf, T extends bmf> bnx<E> a(blt<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bvh<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bmf> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return brj.a(
         (Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bvh.n), $$6x.c(bvh.m), $$6x.b(bvh.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bvj $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bmf> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((blp)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new boh($$5xxxx, true));
                           $$8x.a(new bvk(new boh($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
