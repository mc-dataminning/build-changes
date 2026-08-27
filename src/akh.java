import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class akh<E> implements Codec<jb<E>> {
   private final akm<? extends jk<E>> a;
   private final Codec<ix<E>> b;
   private final Codec<List<ix<E>>> c;
   private final Codec<Either<awm<E>, List<ix<E>>>> d;

   private static <E> Codec<List<ix<E>>> a(Codec<ix<E>> $$0, boolean $$1) {
      Codec<List<ix<E>>> $$2 = $$0.listOf().validate(axn.b(ix::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((ix)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<jb<E>> a(akm<? extends jk<E>> $$0, Codec<ix<E>> $$1, boolean $$2) {
      return new akh<>($$0, $$1, $$2);
   }

   private akh(akm<? extends jk<E>> $$0, Codec<ix<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(awm.b($$0), this.c);
   }

   public <T> DataResult<Pair<jb<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof akl<T> $$2) {
         Optional<iy<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            iy<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<jb<E>> $$2x = (DataResult<jb<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(jb.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<jb<E>> a(iy<E> $$0, awm<E> $$1) {
      return $$0.a($$1)
         .<DataResult<jb<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(jb<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof akl<T> $$3) {
         Optional<ja<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.c().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<jb<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<ix.a<E>> $$1x = new ArrayList<>();

         for (ix<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof ix.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(jb.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(jb<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
