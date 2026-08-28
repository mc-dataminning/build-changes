import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ako<E> implements Codec<jv<E>> {
   private final akt<? extends ke<E>> a;
   private final Codec<jr<E>> b;
   private final Codec<List<jr<E>>> c;
   private final Codec<Either<axf<E>, List<jr<E>>>> d;

   private static <E> Codec<List<jr<E>>> a(Codec<jr<E>> $$0, boolean $$1) {
      Codec<List<jr<E>>> $$2 = $$0.listOf().validate(ayi.b(jr::f));
      return $$1 ? $$2 : ayi.c($$0, $$2);
   }

   public static <E> Codec<jv<E>> a(akt<? extends ke<E>> $$0, Codec<jr<E>> $$1, boolean $$2) {
      return new ako<>($$0, $$1, $$2);
   }

   private ako(akt<? extends ke<E>> $$0, Codec<jr<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(axf.b($$0), this.c);
   }

   public <T> DataResult<Pair<jv<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof aks<T> $$2) {
         Optional<js<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            js<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<jv<E>> $$2x = (DataResult<jv<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(jv.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<jv<E>> a(js<E> $$0, axf<E> $$1) {
      return $$0.a($$1)
         .<DataResult<jv<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(jv<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof aks<T> $$3) {
         Optional<ju<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.d().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<jv<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<jr.a<E>> $$1x = new ArrayList<>();

         for (jr<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof jr.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(jv.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(jv<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
