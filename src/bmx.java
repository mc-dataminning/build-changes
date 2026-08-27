import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmx {
   public static <T extends bkj> bmb<bkj> a(bjx<? extends T> $$0, int $$1, btk<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bkj, T extends bkj> bmb<E> a(bjx<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, btk<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bkj> $$8 = $$2x -> $$0.equals($$2x.ag()) && $$3.test((T)$$2x);
      return bpm.a(
         (Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(btk.n), $$6x.c(btk.m), $$6x.b(btk.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     btm $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bkj> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((bjt)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bml($$5xxxx, true));
                           $$8x.a(new btn(new bml($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
