import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class agg<E> implements Codec<ik<E>> {
   private final agl<? extends is<E>> a;
   private final Codec<ig<E>> b;
   private final Codec<List<ig<E>>> c;
   private final Codec<Either<arz<E>, List<ig<E>>>> d;

   private static <E> Codec<List<ig<E>>> a(Codec<ig<E>> $$0, boolean $$1) {
      Codec<List<ig<E>>> $$2 = asy.a($$0.listOf(), asy.c(ig::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((ig)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<ik<E>> a(agl<? extends is<E>> $$0, Codec<ig<E>> $$1, boolean $$2) {
      return new agg<>($$0, $$1, $$2);
   }

   private agg(agl<? extends is<E>> $$0, Codec<ig<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(arz.b($$0), this.c);
   }

   public <T> DataResult<Pair<ik<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof agk<T> $$2) {
         Optional<ih<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            ih<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).map($$1x -> $$1x.mapFirst($$1xx -> (ik)$$1xx.map($$4::b, ik::a)));
         }
      }

      return this.a($$0, $$1);
   }

   public <T> DataResult<T> a(ik<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof agk<T> $$3) {
         Optional<ij<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.c().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<ik<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<ig.a<E>> $$1x = new ArrayList<>();

         for (ig<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof ig.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(ik.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(ik<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
