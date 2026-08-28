import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class akv<E> implements Codec<jr<E>> {
   private final ala<? extends ka<E>> a;
   private final Codec<jn<E>> b;
   private final Codec<List<jn<E>>> c;
   private final Codec<Either<axi<E>, List<jn<E>>>> d;

   private static <E> Codec<List<jn<E>>> a(Codec<jn<E>> $$0, boolean $$1) {
      Codec<List<jn<E>>> $$2 = $$0.listOf().validate(ayl.b(jn::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((jn)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<jr<E>> a(ala<? extends ka<E>> $$0, Codec<jn<E>> $$1, boolean $$2) {
      return new akv<>($$0, $$1, $$2);
   }

   private akv(ala<? extends ka<E>> $$0, Codec<jn<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(axi.b($$0), this.c);
   }

   public <T> DataResult<Pair<jr<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof akz<T> $$2) {
         Optional<jo<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            jo<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<jr<E>> $$2x = (DataResult<jr<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(jr.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<jr<E>> a(jo<E> $$0, axi<E> $$1) {
      return $$0.a($$1)
         .<DataResult<jr<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(jr<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof akz<T> $$3) {
         Optional<jq<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.d().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<jr<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<jn.a<E>> $$1x = new ArrayList<>();

         for (jn<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof jn.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(jr.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(jr<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
