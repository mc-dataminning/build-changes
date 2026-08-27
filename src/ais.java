import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ais<E> implements Codec<in<E>> {
   private final aix<? extends iv<E>> a;
   private final Codec<ij<E>> b;
   private final Codec<List<ij<E>>> c;
   private final Codec<Either<auo<E>, List<ij<E>>>> d;

   private static <E> Codec<List<ij<E>>> a(Codec<ij<E>> $$0, boolean $$1) {
      Codec<List<ij<E>>> $$2 = avp.a($$0.listOf(), avp.b(ij::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((ij)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<in<E>> a(aix<? extends iv<E>> $$0, Codec<ij<E>> $$1, boolean $$2) {
      return new ais<>($$0, $$1, $$2);
   }

   private ais(aix<? extends iv<E>> $$0, Codec<ij<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(auo.b($$0), this.c);
   }

   public <T> DataResult<Pair<in<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof aiw<T> $$2) {
         Optional<ik<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            ik<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).map($$1x -> $$1x.mapFirst($$1xx -> (in)$$1xx.map($$4::b, in::a)));
         }
      }

      return this.a($$0, $$1);
   }

   public <T> DataResult<T> a(in<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof aiw<T> $$3) {
         Optional<im<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.c().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<in<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<ij.a<E>> $$1x = new ArrayList<>();

         for (ij<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof ij.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(in.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(in<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
