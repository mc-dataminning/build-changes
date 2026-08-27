import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class agn<E> implements Codec<ij<E>> {
   private final ags<? extends ir<E>> a;
   private final Codec<ie<E>> b;
   private final Codec<List<ie<E>>> c;
   private final Codec<Either<asg<E>, List<ie<E>>>> d;

   private static <E> Codec<List<ie<E>>> a(Codec<ie<E>> $$0, boolean $$1) {
      Codec<List<ie<E>>> $$2 = atg.a($$0.listOf(), atg.b(ie::f));
      return $$1
         ? $$2
         : Codec.either($$2, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((ie)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<ij<E>> a(ags<? extends ir<E>> $$0, Codec<ie<E>> $$1, boolean $$2) {
      return new agn<>($$0, $$1, $$2);
   }

   private agn(ags<? extends ir<E>> $$0, Codec<ie<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(asg.b($$0), this.c);
   }

   public <T> DataResult<Pair<ij<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof agr<T> $$2) {
         Optional<ig<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            ig<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).map($$1x -> $$1x.mapFirst($$1xx -> (ij)$$1xx.map($$4::b, ij::a)));
         }
      }

      return this.a($$0, $$1);
   }

   public <T> DataResult<T> a(ij<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof agr<T> $$3) {
         Optional<ii<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.c().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<ij<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<ie.a<E>> $$1x = new ArrayList<>();

         for (ie<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof ie.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(ij.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(ij<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
