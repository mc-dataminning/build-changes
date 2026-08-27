import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class aga<E> implements Codec<ig<E>> {
   private final agf<? extends io<E>> a;
   private final Codec<ib<E>> b;
   private final Codec<List<ib<E>>> c;
   private final Codec<Either<arr<E>, List<ib<E>>>> d;

   private static <E> Codec<List<ib<E>>> a(Codec<ib<E>> $$0, boolean $$1) {
      Codec<List<ib<E>>> $$2 = asq.a($$0.listOf(), asq.c(ib::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((ib)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<ig<E>> a(agf<? extends io<E>> $$0, Codec<ib<E>> $$1, boolean $$2) {
      return new aga<>($$0, $$1, $$2);
   }

   private aga(agf<? extends io<E>> $$0, Codec<ib<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(arr.b($$0), this.c);
   }

   public <T> DataResult<Pair<ig<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof age<T> $$2) {
         Optional<ic<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            ic<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).map($$1x -> $$1x.mapFirst($$1xx -> (ig)$$1xx.map($$4::b, ig::a)));
         }
      }

      return this.a($$0, $$1);
   }

   public <T> DataResult<T> a(ig<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof age<T> $$3) {
         Optional<ie<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.c().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<ig<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<ib.a<E>> $$1x = new ArrayList<>();

         for (ib<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof ib.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(ig.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(ig<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
