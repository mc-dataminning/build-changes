import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class aej<E> implements Codec<hj<E>> {
   private final aeo<? extends hs<E>> a;
   private final Codec<hf<E>> b;
   private final Codec<List<hf<E>>> c;
   private final Codec<Either<apy<E>, List<hf<E>>>> d;

   private static <E> Codec<List<hf<E>>> a(Codec<hf<E>> $$0, boolean $$1) {
      Codec<List<hf<E>>> $$2 = aqw.a($$0.listOf(), aqw.b(hf::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((hf)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<hj<E>> a(aeo<? extends hs<E>> $$0, Codec<hf<E>> $$1, boolean $$2) {
      return new aej<>($$0, $$1, $$2);
   }

   private aej(aeo<? extends hs<E>> $$0, Codec<hf<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(apy.b($$0), this.c);
   }

   public <T> DataResult<Pair<hj<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof aen<T> $$2) {
         Optional<hg<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            hg<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).map($$1x -> $$1x.mapFirst($$1xx -> (hj)$$1xx.map($$4::b, hj::a)));
         }
      }

      return this.a($$0, $$1);
   }

   public <T> DataResult<T> a(hj<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof aen<T> $$3) {
         Optional<hi<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.c().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<hj<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<hf.a<E>> $$1x = new ArrayList<>();

         for (hf<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof hf.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(hj.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(hj<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
