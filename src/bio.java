import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bio {
   public static <T extends bfz> bhs<bfz> a(bfn<? extends T> $$0, int $$1, bpb<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bfz, T extends bfz> bhs<E> a(bfn<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bpb<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bfz> $$8 = $$2x -> $$0.equals($$2x.ae()) && $$3.test((T)$$2x);
      return bld.a(
         (Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bpb.n), $$6x.c(bpb.m), $$6x.b(bpb.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bpd $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bfz> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((bfj)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bic($$5xxxx, true));
                           $$8x.a(new bpe(new bic($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
