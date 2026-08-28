import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class all<E> implements Codec<jk<E>> {
   private final alq<? extends jt<E>> a;
   private final Codec<jg<E>> b;
   private final Codec<List<jg<E>>> c;
   private final Codec<Either<ayc<E>, List<jg<E>>>> d;

   private static <E> Codec<List<jg<E>>> a(Codec<jg<E>> $$0, boolean $$1) {
      Codec<List<jg<E>>> $$2 = $$0.listOf().validate(azg.b(jg::f));
      return $$1 ? $$2 : azg.c($$0, $$2);
   }

   public static <E> Codec<jk<E>> a(alq<? extends jt<E>> $$0, Codec<jg<E>> $$1, boolean $$2) {
      return new all<>($$0, $$1, $$2);
   }

   private all(alq<? extends jt<E>> $$0, Codec<jg<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(ayc.b($$0), this.c);
   }

   public <T> DataResult<Pair<jk<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof alp<T> $$2) {
         Optional<jh<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            jh<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<jk<E>> $$2x = (DataResult<jk<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(jk.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<jk<E>> a(jh<E> $$0, ayc<E> $$1) {
      return $$0.a($$1)
         .<DataResult<jk<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(jk<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof alp<T> $$3) {
         Optional<jj<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.d().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<jk<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<jg.a<E>> $$1x = new ArrayList<>();

         for (jg<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof jg.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(jk.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(jk<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
