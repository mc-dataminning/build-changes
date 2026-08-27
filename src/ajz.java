import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ajz<E> implements Codec<iz<E>> {
   private final ake<? extends ji<E>> a;
   private final Codec<iv<E>> b;
   private final Codec<List<iv<E>>> c;
   private final Codec<Either<awd<E>, List<iv<E>>>> d;

   private static <E> Codec<List<iv<E>>> a(Codec<iv<E>> $$0, boolean $$1) {
      Codec<List<iv<E>>> $$2 = axe.b($$0.listOf(), axe.b(iv::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((iv)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<iz<E>> a(ake<? extends ji<E>> $$0, Codec<iv<E>> $$1, boolean $$2) {
      return new ajz<>($$0, $$1, $$2);
   }

   private ajz(ake<? extends ji<E>> $$0, Codec<iv<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(awd.b($$0), this.c);
   }

   public <T> DataResult<Pair<iz<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof akd<T> $$2) {
         Optional<iw<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            iw<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<iz<E>> $$2x = (DataResult<iz<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(iz.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<iz<E>> a(iw<E> $$0, awd<E> $$1) {
      return $$0.a($$1)
         .<DataResult<iz<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(iz<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof akd<T> $$3) {
         Optional<iy<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.c().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<iz<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<iv.a<E>> $$1x = new ArrayList<>();

         for (iv<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof iv.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(iz.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(iz<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
