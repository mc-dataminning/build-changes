import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class blu {
   public static <T extends bjg> bky<bjg> a(biu<? extends T> $$0, int $$1, bsh<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bjg, T extends bjg> bky<E> a(biu<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bsh<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bjg> $$8 = $$2x -> $$0.equals($$2x.ah()) && $$3.test((T)$$2x);
      return boj.a(
         (Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bsh.n), $$6x.c(bsh.m), $$6x.b(bsh.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bsj $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bjg> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((biq)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bli($$5xxxx, true));
                           $$8x.a(new bsk(new bli($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
