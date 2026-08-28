import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class aky<E> implements Codec<js<E>> {
   private final ald<? extends kb<E>> a;
   private final Codec<jo<E>> b;
   private final Codec<List<jo<E>>> c;
   private final Codec<Either<axl<E>, List<jo<E>>>> d;

   private static <E> Codec<List<jo<E>>> a(Codec<jo<E>> $$0, boolean $$1) {
      Codec<List<jo<E>>> $$2 = $$0.listOf().validate(ayo.b(jo::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((jo)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<js<E>> a(ald<? extends kb<E>> $$0, Codec<jo<E>> $$1, boolean $$2) {
      return new aky<>($$0, $$1, $$2);
   }

   private aky(ald<? extends kb<E>> $$0, Codec<jo<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(axl.b($$0), this.c);
   }

   public <T> DataResult<Pair<js<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof alc<T> $$2) {
         Optional<jp<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            jp<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<js<E>> $$2x = (DataResult<js<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(js.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<js<E>> a(jp<E> $$0, axl<E> $$1) {
      return $$0.a($$1)
         .<DataResult<js<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(js<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof alc<T> $$3) {
         Optional<jr<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.d().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<js<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<jo.a<E>> $$1x = new ArrayList<>();

         for (jo<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof jo.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(js.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(js<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
